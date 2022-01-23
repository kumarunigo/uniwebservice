package com.tutorial.webserviceClient.soap;
import java.net.MalformedURLException;
import java.net.URL;

import com.tutorial.webserviceClient.soap.stub.*;
import com.tutorial.webserviceClient.soap.stub.Math;
public class SoapClientMain {
	public static void main(String[] args) throws MalformedURLException {
		//MathService ms=new MathService(new URL("http://localhost:9090/areaCalculator"));
		MathService ms=new MathService();
		Math m=ms.getMathPort();
		int result=m.calculateRectangle(10, 20);
		System.out.println("area of rectangle :"+result);
	}
}
