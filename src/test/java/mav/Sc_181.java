package mav;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sc_181 {
		@Test
		public void m1() throws IOException, InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demosales.learningchain.in/");
			driver.findElement(By.xpath("//input[@placeholder='User Login']")).sendKeys("DemoUser");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin@123");
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			Actions act=new Actions(driver);
			WebElement moveele = driver.findElement(By.xpath("(//a[@class='sub-icon'])[2]"));
			act.moveToElement(moveele).perform();
			driver.findElement(By.xpath("//a[text()='Verify Certificate ']")).click();
			driver.findElement(By.xpath("//option[text()=' Automation ']")).click();
			driver.findElement(By.xpath("//input[@name=\"VerifierName\"]")).sendKeys("Deepthi");
			driver.findElement(By.xpath("//input[@name=\"VerifierEmail\"]")).sendKeys("deepthi@gmail.com");
			driver.findElement(By.xpath("//input[@name=\"VerifierMobile\"]")).sendKeys("6895437698");
			driver.findElement(By.xpath("//button[text()='Next']")).click();
			driver.findElement(By.xpath("//button[text()='Next']")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//h5[text()='Verifier Details']")).isDisplayed());
			Thread.sleep(3000);

			driver.close();
	}
}
