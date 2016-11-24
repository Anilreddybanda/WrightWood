package com.anil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController 
{	
@RequestMapping("/")
public ModelAndView HomePage()
{
	return new ModelAndView("Home");
}

@RequestMapping("signup")
public ModelAndView Register()
{
	return new ModelAndView("Signuppage");
}
}
