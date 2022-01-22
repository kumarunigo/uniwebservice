package com.tutorial.webservice.soap;
import javax.xml.ws.Endpoint;
public class SoapWebServiceMain {

	public static void main(String[] args) {
		Math mathWebService=new Math();
		Endpoint.publish("http://localhost:9090/areaCalculator",mathWebService );
	}

}
