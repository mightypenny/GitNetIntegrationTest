package com.ioc.sample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.mockito.Mockito.*;

public class ManagementCompanyTest {		
	@Mock 
	private IRepository repository;
	@Mock
	private IValidator validator;

	@InjectMocks
	IManageCompany manageCompany = new ManageCompanyImpl(repository, validator);
		
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);		
	}
		
	@Test
	public void Test() {
		// arrange
		Company c1 = new Company();
		c1.setCompanyId(2);
		
		when(repository.getCompanyById(anyInt())).thenReturn(c1);
		when(validator.Validate(c1)).thenReturn(true);
		
		// act		
		int id = manageCompany.getCompanyById(1).getCompanyId();
		
		// assert		
		Assert.assertEquals(id, 100);
		verify(repository, times(1)).getCompanyById(anyInt());
		verify(validator, times(1)).Validate(c1);
	}
}