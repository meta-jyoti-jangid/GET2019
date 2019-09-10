package com.metacube.training.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.metacube.training.service.MailSender;
import com.metacube.training.service.impl.MockMailSender;
import com.metacube.training.service.impl.SmtpMailSender;

/**
 *
 * This is the configuration class
 * 
 * @author jyoti
 */

@Configuration
public class AppConfig {
	@Bean
	public MailSender smtpMailSender() {
		return new SmtpMailSender();
	}

	@Bean
	@Primary
	public MailSender mockMailSender() {
		return new MockMailSender();
	}
}
