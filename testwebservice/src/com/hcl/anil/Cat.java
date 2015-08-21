package com.hcl.anil;

public class Cat implements IAnimal {

	@Override
	public String getName() { 
		return "Pompei";
	}

	@Override
	public int getAge() { 
		return 2;
	}
		
	@Override
	public int getSalary() {
		return 0;
	}
}
