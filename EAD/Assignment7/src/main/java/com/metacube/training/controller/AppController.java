package com.metacube.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metacube.training.service.MailSender;

/**
 * This is the controller class
 * 
 * @author jyoti
 */
@RestController
public class AppController {
	// This is reference of MailSender Interface
	private MailSender mailSender;

	/**
	 * This is constructor dependency injection using primary annotation
	 * 
	 * @param mailSender object of MailSender interface implementation class
	 */

	@Autowired
	public AppController(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	/**
	 * This is constructor dependency injection using name
	 * 
	 * @param mailSender object of MailSender interface implementation class
	 */
	// @Autowired
	// public AppController(MailSender smtpMailSender) {
	// this.mailSender = smtpMailSender;
	// }

	/**
	 * This is constructor dependency injection using name
	 * 
	 * @param mailSender object of MailSender interface implementation class
	 */
	// @Autowired
	// public AppController(MailSender mockMailSender) {
	// this.mailSender = mockMailSender;
	// }

	/**
	 * This is constructor dependency injection using qualifier
	 * 
	 * @param mailSender object of MailSender interface implementation class
	 */
	// @Autowired
	// public AppController(@Qualifier("mockMailSender") MailSender mailSender) {
	// this.mailSender = mailSender;
	// }

	/**
	 * This is constructor dependency injection using qualifier
	 * 
	 * @param mailSender object of MailSender interface implementation class
	 */
	// @Autowired
	// public AppController(@Qualifier("smtpMailSender") MailSender mailSender) {
	// this.mailSender = mailSender;
	// }

	/**
	 * This is setter dependency injection using primary annotation
	 * 
	 * @param mailSender object of MailSender interface implementation class
	 */
	// @Autowired
	// public void setMailSender(MailSender mailSender) {
	// this.mailSender = mailSender;
	// }

	/**
	 * This is setter dependency injection using name
	 * 
	 * @param mailSender object of MailSender interface implementation class
	 */
	// @Autowired
	// public void setMailSender(MailSender mockMailSender) {
	// this.mailSender = mockMailSender;
	// }

	/**
	 * This is setter dependency injection using name
	 * 
	 * @param mailSender object of MailSender interface implementation class
	 */
	// @Autowired
	// public void setMailSender(MailSender smtpMailSender) {
	// this.mailSender = smtpMailSender;
	// }

	/**
	 * This is setter dependency injection using qualifier
	 * 
	 * @param mailSender object of MailSender interface implementation class
	 */
	/*
	 * @Autowired public void setMailSender(@Qualifier("mockMailSender") MailSender
	 * mailSender) { this.mailSender = mailSender; }
	 */

	/**
	 * This is setter dependency injection using qualifier
	 * 
	 * @param mailSender object of MailSender interface implementation class
	 */
	@Autowired
	public void setMailSender(@Qualifier("smtpMailSender") MailSender mailSender) {
		this.mailSender = mailSender;
	}

	@RequestMapping("/sendMail")
	public String sendMail() {
		mailSender.sendMail();
		return "mail sent succesfully";
	}

}