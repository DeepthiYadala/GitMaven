package mav;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LC_single1 {
@Test
	public void m1() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demosales.learningchain.in/");
	driver.findElement(By.xpath("//input[@placeholder='User Login']")).sendKeys("DemoUser");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin@123");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	Thread.sleep(3000);
	driver.close();
	}
}
