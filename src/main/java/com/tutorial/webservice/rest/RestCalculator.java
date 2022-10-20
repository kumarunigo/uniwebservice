package com.tutorial.webservice.rest;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.net.HttpHeaders;

import io.swagger.annotations.*;

@RestController
public class RestCalculator {
	 
	// method = API = service = operations = function
	// http://localhost/sum/10/25
	// mapping = connection between http request to java method
	@RequestMapping( value="/sum/{a}/{b}" ,  method = RequestMethod.GET  )
			public int add(@PathVariable int a,@PathVariable int b){
				int sum=a+b;
				return sum;
			}
	// http://localhost/websitelogin?userid=john&password=john1!
	@RequestMapping( value="/websitelogin" ,  method = RequestMethod.GET  )
	public String logon(@RequestParam String userid,@RequestParam String password){
		if(userid.equals("john") && password.equals("john1!"))
			return "login is success";
		else 
			return "login failed";
	}
	
	@RequestMapping(value = "/bank", method = RequestMethod.POST,  
			consumes = MediaType.APPLICATION_JSON_VALUE)
	// consumes : this webservice will recieve/input as json
	public int  simpleIntCalcu(@RequestBody Loan l) {
		int simpleInterest=l.principal * l.time * l.rate / 100;
		return simpleInterest;
	}
	// http://localhost/allMathOp/10/2
	@RequestMapping(value = "/allMathOp/{param1}/{param2}", 
			method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	// produces : this webservice will return/output as json
	public Output calculator(@PathVariable int param1, @PathVariable int param2) {
		Output res = new Output();
		res.setSum(param1 + param2);
		res.setSub(param1 - param2);
		res.setMul(param1 * param2);
		res.setDiv(param1 / param2);
		return res;
	}
}