package com.tutorial.webserviceClient.soap;
import com.tutorial.webserviceClient.soap.stub.*;
import com.tutorial.webserviceClient.soap.stub.Math;
public class SoapClientMain {
	public static void main(String[] args) {
		MathService ms=new MathService();
		Math m=ms.getMathPort();
		int result=m.calculateRectangle(10, 20);
		System.out.println("area of rectangle :"+result);
	}
}
