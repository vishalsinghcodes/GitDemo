package vishalmavenjava;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppiumTest {

	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is before method in AppiumTest Class");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("This is after test in AppiumTest Class" );
	}
	
	@Test
	public void NativeAppAndroid() {
		System.out.println("This is NativeAppAndroid of AppiumTest Class");
		
	}
	
	@Test
	public void IOSApps() {
		System.out.println("This is IOSApps of Appium Test Class");
	}
	
}
