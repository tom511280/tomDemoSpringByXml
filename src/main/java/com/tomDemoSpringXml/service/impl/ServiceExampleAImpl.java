package com.tomDemoSpringXml.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tomDemoSpringXml.service.ServiceExampleA;

public class ServiceExampleAImpl implements ServiceExampleA{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceExampleAImpl.class);
	
	@Override
	public void mainFunction() {
		LOGGER.info("ServiceExampleAImpl，執行主方法");
	}
}
