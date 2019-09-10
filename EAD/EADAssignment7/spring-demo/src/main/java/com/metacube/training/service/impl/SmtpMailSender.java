package com.metacube.training.service.impl;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.metacube.training.service.MailSender;

//@Component

/**
 * SmtpMailSender implements the MailSender interface for sending the mail on
 * the console.
 * 
 * @author jyoti
 */
public class SmtpMailSender implements MailSender {
	// This is object of logger
	private static final Logger log = LoggerFactory.getLogger(SmtpMailSender.class);

	/**
	 * This method send mail using smtp
	 * 
	 * @return true if mail send else false
	 */
	@Override
	public void sendMail() {

		log.info("Mail send from smtp mail sender");
	}

}