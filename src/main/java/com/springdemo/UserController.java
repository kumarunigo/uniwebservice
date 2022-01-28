package com.springdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
	@Autowired
	UserService us;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@RequestParam("userid") String uid, @RequestParam("pwd") String pwd) {
		boolean result=us.authentication(uid, pwd);
		if(result == true)
			return "welcome";
		else
			return "login failed";
		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(@RequestParam("userid") String uid, @RequestParam("pwd") String pwd) {
		boolean result=us.register(uid, pwd);
		if(result == true)
			return "registration complete";
		else
			return "registration failed";
		
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("userid") String uid) {
		boolean result=us.delete(uid);
		if(result == true)
			return "unregistration complete";
		else
			return "unregistration failed";
		
	}
}
