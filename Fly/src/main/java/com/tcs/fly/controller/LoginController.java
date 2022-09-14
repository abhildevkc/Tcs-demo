package com.tcs.fly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;










@RestController

public class LoginController {
	
	

	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome");
		return mv;
	}
	
	
	/*
	 * @PostMapping("/adduser") public String login(@RequestBody List<Login>list) {
	 * 
	 * 
	 * //repo.saveAll(list); return"no of users:"+list.size();
	 * 
	 * }
	 */
//	@GetMapping("/getuser")
//	public List <Login>getusers(){
		
		
		//return (List<Login>)repo.findAll();
	}
	
	


