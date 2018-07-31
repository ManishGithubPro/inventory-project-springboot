package com.finra.inventory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class inventoryController {
	@Autowired
	private paymentService paymentService;// 3rd party payment service
	@Autowired
	private emailConfirmationService emailConfirmationService;//Inject emailService to send an email
	@Autowired
    private emailConfirmationService senderService;// to send actual email
    @RequestMapping(path="/placeOrder")
    public String placeOrder() {
    	String orderConfirmation=null;
    	putOrderInWarehouse();// to keep item in store
    	orderObject orderPlace=	addProductUtil.placeOrder("S8",5, "4400886776564043",10.00);
    	chkSingleInventoryImpl chkInventory = new chkSingleInventoryImpl();
    	try {
		if(chkInventory.CheckInventory(orderPlace.getProductId(), orderPlace.getQunatity())) {
			if(paymentService.ChargePayment(orderPlace.getCreditCardNumber(), orderPlace.getAmount())) {
				// send order details in emailbody as confirmation
			  senderService.sendEmail(orderPlace);
			  // this is mock to show in webservice response
			  orderConfirmation="Order "+orderPlace.getProductId()+" has been Placed successfully...!!";
			}
			
			
		}else {
			orderConfirmation = "Not enough items in stock...";
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        return orderConfirmation;
    }
    
    
    
    private void putOrderInWarehouse() {
    	 addProductUtil.addProduct("S8",10);
		
    	
    }
}
