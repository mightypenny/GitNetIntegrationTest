package com.ioc.sample;

class Company {
	private int companyId;
    private String name;
    private String address;
    private String phoneNumber;    
    
    public int getCompanyId() {
    	return companyId;
    }
    
    public void setCompanyId(int companyId) {
    	this.companyId = companyId;
    }

    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getAddress() {
    	return address;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    
    public String getPhoneNumber() {
    	return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }    
}