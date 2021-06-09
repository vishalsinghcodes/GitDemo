package vishalmavenjava;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppiumTest {

	
	@BeforeMethod
	public void beforemethod() {

		System.out.println("This is before method in AppiumTest Class");	
		System.out.println("This is before method in AppiumTest Class by demo man");	
		System.out.println("This is before method in AppiumTest Class by demo man");	
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
	public void NativeAppAndroid2() {
		System.out.println("This is NativeAppAndroid of AppiumTest Class");
		
	}
	
	@Test
	public void IOSApps() {
		System.out.println("This is IOSApps of Appium Test Class");
		
		System.out.println("This is done in develop branch ");
		System.out.println("This is IOSApps of Appium Test Class in develop branch");
	}
	
	@Test
	public void IOSApps3() {
		System.out.println("This is IOSApps of Appium Test Class");
		
		System.out.println("This is done in develop branch ");
		System.out.println("This is IOSApps of Appium Test Class in develop branch");
	}
	
}
