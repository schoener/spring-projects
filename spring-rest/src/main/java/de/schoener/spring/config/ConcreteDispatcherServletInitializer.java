package de.schoener.spring.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ConcreteDispatcherServletInitializer extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		XmlWebApplicationContext context = new XmlWebApplicationContext();
		context.setConfigLocation("classpath:spring/mvc-dispatcher-servlet.xml");
		return context;
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		XmlWebApplicationContext context = new XmlWebApplicationContext();
		context.setConfigLocations("classpath:spring/applicationContext.xml", "classpath:spring/db-jpa-context.xml");
		return context;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
