package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Numeros{
	
@Test
public static  void  main(String[] args) { 
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver1/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver(); 
	  driver.navigate().to("https://demoqa.com/webtables");
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("121232335");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[2]/div[2]/input")).sendKeys("R45454545445464");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[3]/div[2]/input")).sendKeys("diramirez@ucatolica.ac.cr");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[4]/div[2]/input")).sendKeys("24");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[5]/div[2]/input")).sendKeys("3000000");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[6]/div[2]/input")).sendKeys("222552");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[7]/div/button")).click();
	
}
}