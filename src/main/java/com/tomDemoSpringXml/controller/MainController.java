package com.tomDemoSpringXml.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.tomDemoSpringXml.service.MainServicebyName;
import com.tomDemoSpringXml.service.MainServicebyType;

public class MainController extends MultiActionController{
	private static final Logger LOGGER = LoggerFactory.getLogger(MultiActionController.class);
	
	MainServicebyName mainServicebyName;
	
	MainServicebyType mainServicebyType;
	
	/**
	 * @see ByName注入範例
	 * @return ModelAndView
	 */
	public ModelAndView mainActionByName(HttpServletRequest request, HttpServletResponse response) throws Exception {
		LOGGER.info("執行 mainActionByName");
		mainServicebyName.mainFunction();
		return new ModelAndView("welcome", "responseType","ByName注入範例");		
	}
		
	/**
	 * @see ByType注入範例
	 * @return ModelAndView
	 */
	public ModelAndView mainActionByType(HttpServletRequest request, HttpServletResponse response) throws Exception {
		LOGGER.info("執行 mainActionByType");
		mainServicebyType.mainFunction();
		return new ModelAndView("welcome", "responseType","ByType注入範例");			
	}
	
	
	
	public MainServicebyName getMainServicebyName() {
		return mainServicebyName;
	}

	public void setMainServicebyName(MainServicebyName mainServicebyName) {
		this.mainServicebyName = mainServicebyName;
	}

	public MainServicebyType getMainServicebyType() {
		return mainServicebyType;
	}

	public void setMainServicebyType(MainServicebyType mainServicebyType) {
		this.mainServicebyType = mainServicebyType;
	}
}
