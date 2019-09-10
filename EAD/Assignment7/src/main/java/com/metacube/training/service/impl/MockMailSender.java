package com.metacube.training.service.impl;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.metacube.training.service.MailSender;

//@Component
//@Primary
/**
 * MockMailSender implements the MailSender interface for writing the mail on
 * the console.
 * 
 * @author jyoti
 */
public class MockMailSender implements MailSender {

	// This is object of logger
	private static final Logger log = LoggerFactory.getLogger(MockMailSender.class);

	/**
	 * This method send mock mail
	 * 
	 * @return true if mail send else false
	 */
	@Override
	public void sendMail() {

		log.info("Mail send from mock mail sender");
	}

}
