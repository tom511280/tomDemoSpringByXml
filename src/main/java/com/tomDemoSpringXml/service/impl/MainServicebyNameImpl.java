package com.tomDemoSpringXml.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tomDemoSpringXml.service.MainServicebyName;
import com.tomDemoSpringXml.service.ServiceExampleA;
import com.tomDemoSpringXml.service.ServiceExampleB;

public class MainServicebyNameImpl implements MainServicebyName{

	private static final Logger LOGGER = LoggerFactory.getLogger(MainServicebyNameImpl.class);
	
	private ServiceExampleA serviceExampleA;
	private ServiceExampleB serviceExampleB;
	
	@Override
	public void mainFunction() {
		LOGGER.info("MainServicebyNameImpl，執行主方法");
		serviceExampleA.mainFunction();
		serviceExampleB.mainFunction();
	}

	public ServiceExampleA getServiceExampleA() {
		return serviceExampleA;
	}

	public void setServiceExampleA(ServiceExampleA serviceExampleA) {
		this.serviceExampleA = serviceExampleA;
	}

	public ServiceExampleB getServiceExampleB() {
		return serviceExampleB;
	}

	public void setServiceExampleB(ServiceExampleB serviceExampleB) {
		this.serviceExampleB = serviceExampleB;
	}
}
