package com.diegorossi.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.diegorossi.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
