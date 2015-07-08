package com.ioc.sample;


public interface IRepository {
	
	public Company getCompanyById(int companyId);
	
	public Company getCompanyByName(String companyName);
	
	public void addNewCompany(int companyId, String companyName, String companyAddress, String phoneNumber);
	
	public void updateCompany(int companyId, String companyName, String companyAddress, String phoneNumber);
	
	public void deleteCompany(int companyId);
	
}
