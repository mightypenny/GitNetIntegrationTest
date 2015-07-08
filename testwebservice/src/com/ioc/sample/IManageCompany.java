package com.ioc.sample;

import java.util.ArrayList;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface IManageCompany {
	public void setCompanyId(int companyId);
	
	public int getCompanyId();
	
	public Company getCompanyById(int companyId);
	
	public Company getCompanyByName(String companyName);
	
	public ArrayList<Company> getAllCompanies();
		
	public void addNewCompany(Company company);
	
	public void updateCompany(Company company);
	
	public void deleteCompany(int companyId);	
}
