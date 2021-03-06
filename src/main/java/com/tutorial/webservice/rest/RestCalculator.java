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
	
	// path rest webservice
	//http://localhost/addition/10/20
	@RequestMapping( value="/addition/{param1}/{input2}" , method = RequestMethod.GET  )
	public int add( @PathVariable  int param1,@PathVariable(name="input2")  int param2) throws Exception {
		int	sum=param1 + param2;
		return sum;
	}
	
	@RequestMapping(value="/square/{side}" , method=RequestMethod.GET )
	public int areaOfSquare(@PathVariable int side) {
		int areaOfSquare=side * side;
		return areaOfSquare;
	}
	
	// query string rest webservice
	// http://localhost/subCal?param1=10&param2=5
	// http://localhost/getRestaurant?zip=123&street=123
	@RequestMapping(value = "/subCal", method = RequestMethod.GET)
	public int sub(@RequestParam("param1") int a, @RequestParam("param2") int b) {
		int sub=a - b;
		return sub;
	}
	
	// http://localhost/multiply
	@RequestMapping(value = "/multiply", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public int mulCalculator(@RequestBody Input in) {
		// "Input" parameter is json compliant java program
		int mul=in.param1 * in.param2;
		return mul;
	}
	
	// http://localhost/jsonRes/1/2
	@RequestMapping(value = "/jsonRes/{param1}/{param2}", 
			method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Output calculator(@PathVariable int param1, @PathVariable int param2) {
		Output res = new Output();
		res.setSum(param1 + param2);
		res.setSub(param1 - param2);
		res.setMul(param1 * param2);
		res.setDiv(param1 / param2);
		return res;
	}
}