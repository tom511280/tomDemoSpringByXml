package com.tomDemoSpringXml.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.tomDemoSpringXml.service.MainServicebyName;
import com.tomDemoSpringXml.service.MainServicebyType;
import com.tomDemoSpringXml.service.impl.MainServicebyNameImpl;

//@Controller
//@RequestMapping("mainController")
public class MainController extends MultiActionController{
	private static final Logger LOGGER = LoggerFactory.getLogger(MultiActionController.class);
	
	MainServicebyName mainServicebyName;
//	MainServicebyType mainServicebyType111;
	/**
	 * @see 範例入口測試用
	 * @return ModelAndView
	 */
	public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response) throws Exception {
		LOGGER.info("執行 doFirst");
		mainServicebyName.mainFunction();
//		mainServicebyType111.mainFunction();
		return new ModelAndView("welcome", "responseType","執行 doFirst");		
	}
		
	public ModelAndView doSecond(HttpServletRequest request, HttpServletResponse response) throws Exception {
		LOGGER.info("執行 doSecond");		
		return new ModelAndView("welcome", "responseType","執行 doSecond");			
	}
	public MainServicebyName getMainServicebyName() {
		return mainServicebyName;
	}

	public void setMainServicebyName(MainServicebyName mainServicebyName) {
		this.mainServicebyName = mainServicebyName;
	}

//	public MainServicebyType getMainServicebyType() {
//		return mainServicebyType;
//	}
//
//	public void setMainServicebyType(MainServicebyType mainServicebyType) {
//		this.mainServicebyType = mainServicebyType;
//	}
}
