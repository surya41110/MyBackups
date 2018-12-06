package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.OrderMethod;
import com.app.service.IOrderMethodService;

@Controller
@RequestMapping("/ordermethod")
public class OrderMethodController {
	@Autowired
	private IOrderMethodService service;

	// 1. To show Registration Page
	@RequestMapping("/register")
	public String showRegPage(ModelMap map) {
		map.addAttribute("orderMethod", new OrderMethod());
		return "OrderMethodRegister";
	}

	// 2. To do save Operation
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveOrderMethod(@ModelAttribute OrderMethod orderMethod, ModelMap map) {
		int omId = service.saveOrderMethod(orderMethod);
		String msg = "OrderMethod '" + omId + "' Saved!!";
		map.addAttribute("message", msg);
		// clear data
		map.addAttribute("orderMethod", new OrderMethod());
		return "OrderMethodRegister";
	}
}
