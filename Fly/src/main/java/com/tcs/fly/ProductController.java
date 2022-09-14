package com.tcs.fly;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {


	@RequestMapping("welcome")
	public ModelAndView show(Product product) {
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("result", product);
	    mv.setViewName("home");
System.out.println(product);
		
		return mv;
		
		
		
		
	}

	}

