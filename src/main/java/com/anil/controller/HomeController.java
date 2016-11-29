package com.anil.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.anil.model.Product;
import com.google.gson.Gson;
import com.anil.Dao.ProductDAO;
import com.anil.Dao.ProductDAOImpl;

@Controller
public class HomeController {

	ProductDAO productDAO=new ProductDAOImpl();
	
	@RequestMapping("/")
	public ModelAndView Home()
	{
		ModelAndView model=new ModelAndView("Home");
		
		return model;	
	}
	@RequestMapping("/contactme")
	public ModelAndView contactus()
	{
	System.out.println("i am in contact me page");
		return new ModelAndView("ContactUs");
	}
	@RequestMapping("/signin")
	public ModelAndView signin()
	{
		return new ModelAndView("SignIn");
	}
	@RequestMapping("/signup")
	public ModelAndView signupp()
	{
		System.out.println("i amin signup");
		return new ModelAndView("SignUp");
	}
}