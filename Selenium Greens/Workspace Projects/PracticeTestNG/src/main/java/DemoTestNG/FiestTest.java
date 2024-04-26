package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FiestTest {

	@Test
	
	public void google() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		driver.manage ().window().maximize(); driver.get("https://www.google.com/");
		driver.findElement (By.name ("q")) .sendKeys ("Testing", Keys. ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep (5000); 
		driver.quit ();
	}
	
@Test
	
	public void facebook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver ();
		driver.manage ().window().maximize(); driver.get("https://www.facebook.com/");
		driver.findElement (By.name ("email")) .sendKeys ("Testing", Keys. ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep (5000); 
		driver.quit ();
	}
}
