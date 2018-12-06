package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Uom;
import com.app.service.IUomService;

@Controller
@RequestMapping(value="/uom")
public class UomController {

	@Autowired
	private IUomService service;
	
	//1. show register page
	@RequestMapping(value="/register")
	public String showRegister(ModelMap map)
	{
		map.addAttribute("uom",new Uom());
		return "UomRegister";
	}
	//2. save uom
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveUom(@ModelAttribute Uom uom,ModelMap map)
	{
		int uomId=service.saveUom(uom);
		map.addAttribute("message","Uom  '"+uomId+"' Saved");
		map.addAttribute("uom",new Uom());
		return "UomRegister";
		
	}
}
