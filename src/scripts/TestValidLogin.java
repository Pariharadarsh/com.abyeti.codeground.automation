package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.Lib;
import pom.LoginPage;

public class TestValidLogin extends BaseTest
{
//ValidLogin
	@Test
	public void testValidLogin(){
	
		LoginPage l=new LoginPage(driver);
		//enter username
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		l.setUserName(username);
		//enter password
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		l.setPassword(password);
		//click onlogin button
		l.clickLogin();
	}

}
