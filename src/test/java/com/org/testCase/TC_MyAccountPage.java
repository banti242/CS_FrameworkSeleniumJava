package com.org.testCase;

import org.testng.annotations.Test;

import com.org.base.BaseClass;
import com.org.pageObject.Homepage;
import com.org.pageObject.Myaccount;

public class TC_MyAccountPage extends BaseClass {
	
	@Test
	public void verifyRegistration() throws InterruptedException
	{
		//open url
		
		
		
		Homepage hpg=new Homepage();
		hpg.getSignIn();
		hpg.getCreateMyAccount();
		
		hpg.getcontinuewithEmail();
		
		Myaccount map=new Myaccount();
		map.getEmail("mukeshksingh242@gmail.com");
		map.getUserName();
		map.getPassword("Mukesh@123");
		map.getCreateAccount();
		
	}
}
