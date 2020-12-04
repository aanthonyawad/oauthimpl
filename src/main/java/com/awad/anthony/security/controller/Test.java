package com.awad.anthony.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	
@GetMapping(path="/public" , produces="application/json")
private String publicc() {
	return "public";
}

@GetMapping(path="/private" , produces="application/json")
private String privatee() {
	return "private";
}
}
