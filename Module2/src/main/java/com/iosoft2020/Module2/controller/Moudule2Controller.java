package com.iosoft2020.Module2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Moudule2Controller {


	@RequestMapping("/Module2/list")
	public String list() {
		return "/Module2/list";
	}


}
