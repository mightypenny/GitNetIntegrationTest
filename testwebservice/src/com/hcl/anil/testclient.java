package com.hcl.anil;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class testclient {
	public static void main(String[] args) throws MalformedURLException {		
		URL url = new URL("http://localhost:8080/test?wsdl");
		
		QName qName = new QName("http://anil.hcl.com/", "testwebserviceimplService");
		
		Service service = Service.create(url, qName);
		testwebservice testservice = service.getPort(testwebservice.class);
		System.out.println(testservice.add(1,  20));
	}
}
