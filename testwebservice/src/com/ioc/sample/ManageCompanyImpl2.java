package com.ioc.sample;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(endpointInterface="com.ioc.sample")
@SOAPBinding(style=Style.RPC)
public class ManageCompanyImpl2 implements IManageCompany {

	private IRepository repository;
	private IValidator validator;
	
	private int companyId;

	public ManageCompanyImpl2(IRepository repository, IValidator validator) {
		this.repository = repository;
		this.validator = validator;
	}
	
	@Override
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	
	@Override
	public int getCompanyId() {
		return this.companyId;
	}
			
	@Override
	public ArrayList<Company> getAllCompanies() {
		ArrayList<Company> companies = new ArrayList<Company>();
		
		Company comp1 = new Company();
		comp1.setCompanyId(100);
		comp1.setName("company 100");
		comp1.setAddress("address 100");
		
		Company comp2 = new Company();
		comp2.setCompanyId(200);
		comp2.setName("company 200");
		comp2.setAddress("address 200");
		
		companies.add(comp1);
		companies.add(comp2);
		
		return companies;
	}
	
	@Override
	public Company getCompanyById(int companyId) {				
		Company company = this.repository.getCompanyById(companyId);
		
		company.setCompanyId(1000);
		
		if (validator.Validate(company)) {
			
		}
		
		return company;
	}

	@Override
	public Company getCompanyByName(String companyName) {
		return this.repository.getCompanyByName(companyName);
	}

	@Override
	public void addNewCompany(Company company) {
		if (this.validator.Validate(company)) {
			this.repository.addNewCompany(
					company.getCompanyId(), 
					company.getName(), 
					company.getAddress(), 
					company.getPhoneNumber());
		}
		else {
			System.out.println("Company data validation failed");
		}
	}

	@Override
	public void updateCompany(Company company) {
		if (this.validator.Validate(company)) {
			this.repository.updateCompany(
					company.getCompanyId(), 
					company.getName(), 
					company.getAddress(), 
					company.getPhoneNumber());
		}
		else {			
			System.out.println("Company data validation failed");
		}
	}

	@Override
	public void deleteCompany(int companyId) {
		this.repository.deleteCompany(companyId);
	}
	
}
