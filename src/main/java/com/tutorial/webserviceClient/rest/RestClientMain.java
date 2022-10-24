package com.tutorial.webserviceClient.rest;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.tutorial.webserviceClient.rest.Input;
import com.tutorial.webserviceClient.rest.Output;

public class RestClientMain {

	public static void main(String[] args) {
		testJsonRes(); // Consume get rest service with path param
	}
/*	
	Get Http client
	URL = ? includes url and input both
	Response = what output is expected from rest services
		int/string/float etc.. if response is json an object(json compliant)
*/
	public static void testAdd() {
		RestTemplate client=new RestTemplate(); // similar to soap stub program
		int res=client.getForObject("http://localhost/add/10/30", Integer.class);
		System.out.println("Add rest service result :"+res);
	}
	// get method
	// URL = url include http part + input
	// output = resonse
	public static void testSub() {
		RestTemplate getTest=new RestTemplate();
		int res=getTest.getForObject("http://localhost/sub?number1=50&number2=15", Integer.class);
		System.out.println("Sub rest service result :"+res);
	}
/*
	Post Http client
	URL = ? includes url 
	Request = if sending json input pass object(json compliant) 
	Response = what output is expected from rest services
		int/string/float etc.. object(json compliant) if response is json
*/
	public static void testSimInt()
	{
//Post	: 1) url 2) input(si) 3) output		
		
		SimpleInterestInput si=new SimpleInterestInput ();
		si.principal=250000; si.time=120; si.rate=2;
		RestTemplate post=new RestTemplate();
	int res=post.postForObject("http://localhost/simpleInt", 
						si
						, Integer.class);
	System.out.println(res );
	}
	public static void testJsonRes()
	{
		RestTemplate client=new RestTemplate();
		ComplexOutput res=client.getForObject("http://localhost/allMath/100/10", ComplexOutput.class);
		/*
		{
		    "sum": 15,
		    "sub": 5,
		    "mul": 50,
		    "div": 2
		}
		*/
		System.out.println(res.sum);
		System.out.println(res.sub);
		System.out.println(res.mul);
		System.out.println(res.div);
		
		
	}
	/*
	 
	public static void testSubP() {
		RestTemplate getTest=new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("x", "20");
		map.add("y", "10");
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
   
		int res=getTest.postForObject
				("http://localhost:8888/subCalP",request,
						Integer.class);
		System.out.println("Sub rest service result :"+res);
	}
	 */
}
