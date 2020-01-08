package Selflearning;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class LaunchSlearning {
	public static void main(String[] arg)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch website
		driver.navigate().to("https://selflearning.io/");
		
		//Logo click 
		WebElement Logo = driver.findElement(By.xpath("//a[@href=\"https://selflearning.io/\"]/img"));
		Logo.click();
		
		//Header Menu
		
		WebElement Govt_Link = driver.findElement(By.xpath("//a[text()=\"Government Job\"]"));
		WebElement Ent_Link = driver.findElement(By.xpath("//a[text()=\"Entrance Test\"]"));
		WebElement Soft_Link = driver.findElement(By.xpath("//a[text()=\"Software And It\"]"));
		Actions Act=new Actions(driver);
		Act.moveToElement(Govt_Link).perform();
		Act.moveToElement(Ent_Link).perform();
		Act.moveToElement(Soft_Link).perform();
		
		//refresh the page
		driver.navigate().refresh();
		
		
		// Container Link
		
		//Software & IT
		//driver.findElement(By.xpath("//section//div//li/a[text()='Web Development ']")).click();
		for(int i=1; i<4; i++)
		{
			WebElement link=driver.findElement(By.xpath("//div[@id='web-development']/div["+i+"]/a"));
			link.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		driver.findElement(By.xpath("//section//div//li/a[text()='Testing']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section//div//div[@id='testing']//a")).click();
		driver.navigate().back();
		
		
		for(int i=1; i<5; i++)
		{
			driver.findElement(By.xpath("//section//div//li/a[text()='Ethical Hacking']")).click();
			Thread.sleep(1000);
			WebElement link=driver.findElement(By.xpath("//div[@id='ethical-hacking']/div["+i+"]/a"));
			link.click();
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(1000);
		}
		
		
		driver.findElement(By.xpath("//section//div//li/a[text()='Popular IT Skill']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section//div//div[@id='popular-it-skill']//a")).click();
		driver.navigate().back();
		
		
		// Entrance Test
		driver.findElement(By.xpath("//section//div//li/a[text()='JEE']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='jee']//a")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//section//div//li/a[text()='NEET']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section//div//div[@id='neet']//a")).click();
		driver.navigate().back();
		
		
		// Government Job
		driver.findElement(By.xpath("//section//div//li/a[text()='Bank PO']")).click();
		driver.findElement(By.xpath("//section//div//li/a[text()='Common Syllabus']")).click();
		
		
		driver.close();
		
	}

}
