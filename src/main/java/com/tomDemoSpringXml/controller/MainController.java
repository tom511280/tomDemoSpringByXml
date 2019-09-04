package com.tomDemoSpringXml.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.tomDemoSpringXml.service.MainServicebyName;

//@Controller
//@RequestMapping("mainController")
public class MainController extends MultiActionController{
	
	MainServicebyName mainServicebyName;
	
	/**
	 * @see 範例入口測試用
	 * @return Map
	 */
//	@RequestMapping(value="mainActionUsingTest", method = RequestMethod.GET)
//	@ResponseBody
//	public Map<String, Object> mainActionUsingTest(){
//		Map<String, Object> map = new HashMap<String, Object>();
//		mainServicebyName.mainFunction();
//
//		
//		map.put("responseType", "測試完成");
//		return map;	
//	}

	public MainServicebyName getMainServicebyName() {
		return mainServicebyName;
	}

	public void setMainServicebyName(MainServicebyName mainServicebyName) {
		this.mainServicebyName = mainServicebyName;
	}
	
	public ModelAndView home(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("message", "Home");
		mainServicebyName.mainFunction();
		return model;
	}

	public ModelAndView add(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("message", "Add");
		mainServicebyName.mainFunction();
		return model;
	}
}
