package com.tomDemoSpringXml.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tomDemoSpringXml.service.MainServicebyName;
import com.tomDemoSpringXml.service.MainServicebyType;

public class MainServicebyNameImpl implements MainServicebyName{

	private static final Logger LOGGER = LoggerFactory.getLogger(MainServicebyNameImpl.class);
	
	@Override
	public void mainFunction() {
		LOGGER.info("MainServicebyNameImpl，執行主方法");
	}

}
