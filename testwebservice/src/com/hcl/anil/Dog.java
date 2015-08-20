package com.hcl.anil;

public class Dog implements IAnimal {

	@Override
	public String getName() { 
		return "Pompei";
	}

	@Override
	public int getAge() { 
		return 5;
	}

	@Override
	public int getSalary() { 
		return 1;
	}		
}