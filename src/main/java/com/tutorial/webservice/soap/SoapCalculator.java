package com.tutorial.webservice.soap;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.RPC)
public class SoapCalculator {
	
	// validation : verify input and output
	//					only available in schema of wsdl
	
	// RPC : simple input output : primitive data type and String
	//			dont need validation
	// faster
	
	// Document : complex input output data type
	//			need validation( schema included in wsdl )
	// slower
	public int add(int p1, int p2) {
		System.out.println("adding " + p1 + "  " + p2);
		return p1 + p2;
	}
	
	public boolean login(String userid,String password) {
		if(userid.equals("john") && password.equals("john1!"))
			return true;
		else
			return false;
	}

}
