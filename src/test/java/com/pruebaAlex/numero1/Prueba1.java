package com.pruebaAlex.numero1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
public class Prueba1 
{
	 private WebDriver driver;

	

	@Test
	public void PruebaImagenYVolveraHome() 
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[8]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/a/img")).click();
		driver.get("https://demoqa.com/");
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/input")).sendKeys("Alex");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[11]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/a")).click();
		
	}
	

		
	
	
	
}
