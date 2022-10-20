package com.tutorial.webservice.soap;
import javax.xml.ws.Endpoint;
public class SoapWebServiceMain {

	public static void main(String[] args) {
		SoapCalculator soap=new SoapCalculator();
		Endpoint.publish("http://localhost:9090/addService",soap );
	}

}
