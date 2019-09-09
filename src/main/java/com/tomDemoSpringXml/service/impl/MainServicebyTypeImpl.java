package com.tomDemoSpringXml.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tomDemoSpringXml.service.MainServicebyType;
import com.tomDemoSpringXml.service.ServiceExampleA;
import com.tomDemoSpringXml.service.ServiceExampleB;

public class MainServicebyTypeImpl implements MainServicebyType{
	private static final Logger LOGGER = LoggerFactory.getLogger(MainServicebyTypeImpl.class);	
	private ServiceExampleA serviceExampleATest;
	private ServiceExampleB serviceExampleBTest;
	
	@Override
	public void mainFunction() {
		LOGGER.info("MainServicebyTypeImpl，執行主方法");	
		serviceExampleATest.mainFunction();
		serviceExampleBTest.mainFunction();
	}

	public ServiceExampleA getServiceExampleATest() {
		return serviceExampleATest;
	}

	public void setServiceExampleATest(ServiceExampleA serviceExampleATest) {
		this.serviceExampleATest = serviceExampleATest;
	}

	public ServiceExampleB getServiceExampleBTest() {
		return serviceExampleBTest;
	}

	public void setServiceExampleBTest(ServiceExampleB serviceExampleBTest) {
		this.serviceExampleBTest = serviceExampleBTest;
	}
}
