package com.hcl.anil;

public class Dog implements IAnimal {

	@Override
	public String getName() { 
		return "kimchi";
	}

	@Override
	public int getAge() { 
		return 4;
	}

	@Override
	public int getSalary() { 
		return 0;
	}		
}