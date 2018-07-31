package com.finra.inventory;
import org.springframework.stereotype.Component;


@Component
public class paymentService {

	public boolean ChargePayment(String creditCardNumber, double amount) throws Exception {
		
		boolean isValid=creditCardNumber!=null && creditCardNumber.length()==16 && amount>0?true:false;
		if(isValid) {
			chargeFee(creditCardNumber);
			// After fee charge by 3rd party ; charge actual total  amount from credit card
		}
		return isValid;
	}
	
	private boolean chargeFee(String creditCardNumber) {
		// Assume fee is $3 per call
		
		// deduct $3 from credit card and make further call like deposit to bank acct
		return true;
	}
}
