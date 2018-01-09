package org.mycompany.webservice.client;

import org.mycompany.webservice.HelloWorld;
import org.mycompany.webservice.HelloWorldImplService;

public class JAXWSClent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldImplService helloWorldImplService = new HelloWorldImplService();
		HelloWorld helloWorld = helloWorldImplService.getHelloWorldImplPort();
		System.out.println(helloWorld.helloWorld("bebebe"));
	}
}
