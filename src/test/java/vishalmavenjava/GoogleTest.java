package vishalmavenjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void abc() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Udemy Selenium\\\\WebDrivers\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(5000L);
		driver.close();
		System.out.println("Google test is pass");
		
	}
	@Test
	public void xyz() {
		DesiredCapabilities dc = new DesiredCapabilities().chrome();
		dc.acceptInsecureCerts();
		
		ChromeOptions c = new ChromeOptions();
		c.merge(dc);
		c.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "F:\\\\Udemy Selenium\\\\WebDrivers\\\\Chrome\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com/in/apps/samsung-members/?cid=in_paid_ppc_google_allproducts_none_allproducts-eshop-bau-dsa_text_20200105_719335193-40302839271---446538506521-aud-747500539832:dsa-904431574476&gclid=EAIaIQobChMImM-uv7rQ8AIVUFtgCh0gSAqTEAAYASAAEgKgRPD_BwE");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//ul[@class='gb-gnb__main']/li[1]"))).build().perform();
		//a.moveToElement(driver.findElement(By.xpath("//a[@class='s-depth3-link']//span[contains(text(),'Galaxy S20 FE')]"))).click().build().perform();	
		////a[@class='s-depth3-link']//span[contains(text(),'Galaxy S20 FE')]
		driver.close();
		
		
	}

}
