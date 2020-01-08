package Selflearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JeeMain {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions Act=new Actions(driver);
		//Launch website
		driver.navigate().to("https://selflearning.io/");
		
		driver.findElement(By.xpath("//div[@id='jee']//a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//section//div//li/a[text()='NEET']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section//div//div[@id='neet']//a")).click();
		
		
		//Side tab
		WebElement StudyMaterial = driver.findElement(By.xpath("//section//div[@class='sidenav']//a[@href=\"https://selflearning.io/study-material/neet-ug\"]"));
		Thread.sleep(1000);
		Act.moveToElement(StudyMaterial).perform();
		WebElement TestSeries = driver.findElement(By.xpath("//section//div[@class='sidenav']//a[@href=\"https://selflearning.io/test-series/neet-ug\"]"));
		Thread.sleep(1000);
		Act.moveToElement(TestSeries).perform();
		
		//row link
		
		WebElement Test_Series = driver.findElement(By.xpath("//section//div[@class='row']//a[text()='Test Series']"));
		Act.moveToElement(Test_Series).perform();
		Thread.sleep(1000);
		WebElement Study_Material = driver.findElement(By.xpath("//section//div[@class='row']//a[text()='Study Material']"));
		Act.moveToElement(Study_Material).perform();
		
		
		
		//Read more
		driver.findElement(By.linkText("Read More...")).click();
		driver.close();
	}

}
