package com.iosoft2020.Module2.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/Module2")
public class Module2Controller {

	@RequestMapping("/list")
	public String list() {
		return "Module2Controller#list invoked..";
	}


}
