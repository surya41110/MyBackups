package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.WhUserType;
import com.app.service.IWhUserTypeService;

@Controller
@RequestMapping("/whusertype")
public class WhUserTypeController {
	@Autowired
	private IWhUserTypeService service;
	
	// 1. To show Registration Page
		@RequestMapping("/register")
		public String showRegPage(ModelMap map) {
			map.addAttribute("whUserType", new WhUserType());
			return "WhUserTypeRegister";
		}

		// 2. To do save Operation
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveWhUserType(@ModelAttribute WhUserType whUserType, ModelMap map) {
			int omId = service.saveWhUserType(whUserType);
			String msg = "WhUserType '" + omId + "' Saved!!";
			map.addAttribute("message", msg);
			// clear data
			map.addAttribute("whUserType", new WhUserType());
			return "WhUserTypeRegister";
		}

}
