package com.tutorial.webservice.soap;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

// publishing/providing webservice
// clients can calcualte area of square and rectangle
@WebService
/*
 Document = complex data type and Validation
 RPC = simple webservice, primitve or string data type.. NO validation
 
 RPC
 	@SOAPBinding(style = Style.RPC)
 Document literal = dont use IF 2 method with same input
 	@SOAPBinding(style = Style.DOCUMENT)
 Document literal wrapped = use IF 2 method with same input
 	@SOAPBinding(style = Style.DOCUMENT,parameterStyle = ParameterStyle.WRAPPED)
 */
public class Math {
	public int calculateSquare(int sides) {
		return sides * sides;
	}
	public ArrayList<String> testing(ArrayList<String> input) {
		ArrayList<String>  te=new ArrayList<String>();
		te.add("john");
		te.add("jane");
		return te;
	}
	public int calculateRectangle(int height,int width) {
		return height * width;
	}
}
