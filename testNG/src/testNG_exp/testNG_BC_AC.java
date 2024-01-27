package testNG_exp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNG_BC_AC {
@BeforeClass
public void login() {
	System.out.println("login completed");
}
@AfterClass
public void logout() {
	System.out.println("logout completed");
}
	@Test
public void deleteemp() {
	System.out.println("deleteemp completed");
}
	
@Test
public void addemp() {
System.out.println("addemp completed");	
}
}