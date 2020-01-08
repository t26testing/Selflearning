package Selflearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		{
			System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://selflearning.io/");
			WebElement LoginBtn = driver.findElement(By.xpath("//a[text()=\"Login\"]"));
			LoginBtn.click();
			WebElement UserNameTxtField = driver.findElement(By.name("username"));
			UserNameTxtField.sendKeys("test001");
			WebElement PasswordTxtField = driver.findElement(By.name("password"));
		    PasswordTxtField.sendKeys("Match@2020");
		    WebElement Login = driver.findElement(By.xpath("//form//input[@value='LOGIN']"));
		    Login.click();
			
			
			driver.close();
		}

	}

}
