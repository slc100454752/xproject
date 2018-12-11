package com.slc.XProject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@RequestMapping("xproject/")
	public String index() { 
		return "xproject";
	}
}
