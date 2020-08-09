package com.iosoft2020.Module1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iosoft2020.Module1.fein.Module2FenService;

@RestController
@RequestMapping("/Module1")
public class Module1Controller {

	@Autowired
	private Module2FenService module2FenService;

	@RequestMapping("/getModule2List")
	public String getModule2List() {
		return module2FenService.list();
	}
}
