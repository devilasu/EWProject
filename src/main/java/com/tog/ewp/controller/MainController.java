package com.tog.ewp.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class MainController {
	
	@GetMapping("/")
	public String homePage() {
		return "home";
	}
	
	@GetMapping("/test")
	public String testPage(Model model) {
		model.addAttribute("data","여보 사랑해♡");
		return "test";
	}
}
