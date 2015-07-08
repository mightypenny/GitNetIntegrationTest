package com.ioc.sample;


public class RepositoryImpl implements IRepository {

	@Override
	public Company getCompanyById(int companyId) {
		Company company = new Company();
		
		company.setCompanyId(1);
		company.setName("company name");
		company.setAddress("company address");
		company.setPhoneNumber("company phonenumber");		
		
		return company;
	}

	@Override
	public Company getCompanyByName(String companyName) {
		Company company = new Company();
		
		company.setCompanyId(1);
		company.setName("company name");
		company.setAddress("company address");
		company.setPhoneNumber("company phonenumber");
		
		return company;
	}

	@Override
	public void addNewCompany(int companyId, String companyName,
			String companyAddress, String phoneNumber) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void updateCompany(int companyId, String companyName,
			String companyAddress, String phoneNumber) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void deleteCompany(int companyId) {
		// TODO Auto-generated method stub		
	}

}
