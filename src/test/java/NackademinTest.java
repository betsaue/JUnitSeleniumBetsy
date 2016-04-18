import static org.junit.Assert.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NackademinTest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://www.nackademin.se");
	}

	@Test
	public void test() {
		driver.findElement(By.linkText("IT")).click();
		
	}
	
	@Test
	public void searchFor() {
		
		driver.findElement(By.id("search")).sendKeys("Testautomatiserare");
		driver.findElement(By.xpath("//input[@value='Sök']")).click();
		driver.findElement(By.linkText("Kurser Testautomatiserare")).click();
		
	}
	

	@AfterClass
	public static void afterClass() {
		driver.close();
	}
}
