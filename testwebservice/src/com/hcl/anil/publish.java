package com.hcl.anil;

import javax.xml.ws.Endpoint;

public class publish {
	public static void main(String[] args) {		
		 Endpoint endpoint = Endpoint.publish("http://localhost:8080/test", new testwebserviceimpl());
		 System.out.println(endpoint.isPublished());
	}
}
