import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HemnetTest {

private static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://www.hemnet.se");
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("login-action")).click();
		driver.findElement(By.id("anvandare_session_login")).sendKeys("betsy.b.samuel@gmail.com");
		driver.findElement(By.id("anvandare_session_password")).sendKeys("Kunjumol1");
		
		if(driver.findElement(By.id("anvandare_session_remember_me")).isSelected()){
		driver.findElement(By.id("anvandare_session_remember_me")).click();
		}
		TimeUnit.MILLISECONDS.sleep(500);
		driver.findElement(By.name("commit")).click();
			
	}
	

}
