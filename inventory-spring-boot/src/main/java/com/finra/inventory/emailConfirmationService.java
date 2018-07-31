package com.finra.inventory;


import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class emailConfirmationService {
	 @Autowired
	 private JavaMailSender mailSender;
	 
	 public void sendEmail(orderObject orderPlace) {
	
		 // send an email with order details and amount in email body
		 MimeMessage message = mailSender.createMimeMessage();
		 sendOrderConfirmationEmail(message);
		 
	 }
	 
	 private void sendOrderConfirmationEmail(MimeMessage mail) {
            System.out.println("Sending email....");
	       // mailSender.send(mail);
	    }

	}
