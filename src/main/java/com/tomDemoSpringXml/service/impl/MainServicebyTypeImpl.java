package com.tomDemoSpringXml.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.tomDemoSpringXml.service.MainServicebyName;
import com.tomDemoSpringXml.service.MainServicebyType;

//@Service
public class MainServicebyTypeImpl implements MainServicebyType{
	private static final Logger LOGGER = LoggerFactory.getLogger(MainServicebyTypeImpl.class);	
	
	@Override
	public void mainFunction() {
		LOGGER.info("MainServicebyTypeImpl，執行主方法");	
	}
}
