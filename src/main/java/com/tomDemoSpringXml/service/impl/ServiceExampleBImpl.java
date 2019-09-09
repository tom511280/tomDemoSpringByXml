package com.tomDemoSpringXml.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tomDemoSpringXml.service.ServiceExampleB;

public class ServiceExampleBImpl implements ServiceExampleB{
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceExampleBImpl.class);
	
	@Override
	public void mainFunction() {
		LOGGER.info("ServiceExampleBImpl，執行主方法");
	}
}
