package Selflearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selflearning.io/");
		WebElement RegisterBtn = driver.findElement(By.xpath("//a[text()=\"Register\"]"));
		RegisterBtn.click();
		driver.findElement(By.name("email")).sendKeys("testqadelhi8@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Match@2020");
		driver.findElement(By.name("username")).sendKeys("Testqa");
		driver.findElement(By.name("mobile")).sendKeys("7011487764");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//form//input[@value='REGISTER']")).click();
		
		//Links
		driver.findElement(By.linkText("Already registered? Login Now")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		
		//driver.close();
	}

}
