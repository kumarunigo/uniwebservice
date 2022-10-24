package com.tutorial.webserviceClient.soap;
import java.net.MalformedURLException;
import java.net.URL;

import com.tutorial.webserviceClient.soap.stub.*;
public class SoapClientMain {
	public static void main(String[] args) throws MalformedURLException {
		//MathService ms=new MathService(new URL("http://localhost:9090/areaCalculator"));
		SoapCalculatorService ms=new SoapCalculatorService();
		SoapCalculator  m=ms.getSoapCalculatorPort();
		int result=m.add(30, 40);
		System.out.println("add :"+result);
	}
}
