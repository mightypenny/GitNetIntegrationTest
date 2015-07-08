package com.ioc.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {		
	public static final ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/Beans.xml");
	
	public static void main(String[] args) {
		IManageCompany srv = context.getBean("manageCompany", IManageCompany.class);
		
		System.out.println(srv.getCompanyId());
		
		Company company = srv.getCompanyById(1);		
		System.out.println(company.getName());
		System.out.println(company.getAddress());
		System.out.println(company.getPhoneNumber());
		
		System.out.println(company.getCompanyId());
			
		System.out.println("Display list");		
		for (Company comp : srv.getAllCompanies()) {
			System.out.println(comp.getCompanyId());
			System.out.println(comp.getName());
			System.out.println(comp.getAddress());					
		}
	}
}