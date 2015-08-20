package com.hcl.anil;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(endpointInterface="com.hcl.anil.testwebservice")
@SOAPBinding(style=Style.RPC)
public class testwebserviceimpl implements testwebservice {
	@Override
	public int add(int x, int y) {
		if (y == 0) {
			return 0;
		}
		else {
			return x + y;
		}
	}
	
	// branch test 1 update on different file
	// branch test 1 update on different file
	// branch test 1 update on different file
}