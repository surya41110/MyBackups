package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.ShipmentType;
import com.app.service.IShipmentTypeService;

@Controller
@RequestMapping("/shipmenttype")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	//1.To Show Registration Page
	@RequestMapping("/register")
	public String showRegPage(ModelMap map)
	{
		map.addAttribute("shipmentType",new ShipmentType());
		return "ShipmentTypeRegister";
	}
	//2.To Save Data
	@RequestMapping(value="save",method=RequestMethod.POST)
	private String saveShipmentType(@ModelAttribute ShipmentType shipmentType,ModelMap map )
	{
		int stId=service.saveShipmentType(shipmentType);
		String msg="ShipmentType '"+stId+"' Saved!";
		map.addAttribute("message",msg);
		//clear data
		map.addAttribute("shipmentType",new ShipmentType());
		return "ShipmentTypeRegister";
	}
	
}
