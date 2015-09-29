package com.login;

import java.util.Map;

import org.hibernate.validator.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginControler {
	@RequestMapping(value="/loginform", method=RequestMethod.GET)
	public String viewLogin(Map<String, Object> model){
		Loginform loginForm=new Loginform();
		model.put("loginform", loginForm);
		return "loginform";
	}
	
	@RequestMapping(value="/loginform", method=RequestMethod.POST)
	public String login( @ModelAttribute("loginform") Loginform loginform, BindingResult result, Map<String, Object> model){
		if(result.hasErrors()){
			return "loginform";
		}
		
		return "LoginSuccess";
	}

}
