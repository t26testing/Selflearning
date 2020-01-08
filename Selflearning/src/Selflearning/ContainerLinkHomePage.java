package Selflearning;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContainerLinkHomePage {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch website
		driver.navigate().to("https://selflearning.io/");
		
		
		driver.findElement(By.xpath("//section//div//li/a[text()='Testing']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section//div//div[@id='testing']//a")).click();
		Actions Act=new Actions(driver);
		//Act.moveToElement(Jmeter).perform();
		
				//Software & IT
				//driver.findElement(By.xpath("//section//div//li/a[text()='Web Development ']")).click();
				//List<WebElement> WebLinks = driver.findElements(By.xpath("//div[@id='web-development']/div/a"));
				for(int i=1; i<4; i++)
				{
					WebElement link=driver.findElement(By.xpath("//div[@id='web-development']/div["+i+"]/a"));
					link.click();
					Thread.sleep(1000);
					driver.navigate().back();
					Thread.sleep(1000);
				}
				
				
				driver.findElement(By.xpath("//section//div//li/a[text()='Testing']")).click();
				
				driver.findElement(By.xpath("//a[@href=\"https://selflearning.io/category/jmeter\"]")).click();
				
				driver.navigate().back();
		
				
//				driver.findElement(By.xpath("//section//div//li/a[text()='Ethical Hacking']")).click();
//				for(int j=1; j<5; j++)
//				{
//					WebElement link2=driver.findElement(By.xpath("//div[@id='ethical-hacking']/div["+j+"]/a"));
//					link2.click();
//					Thread.sleep(1000);
//					driver.navigate().back();
//					Thread.sleep(1000);
//				}
//				driver.findElement(By.xpath("//section//div//li/a[text()='Popular IT Skill']")).click();
//				
//					WebElement link3=driver.findElement(By.xpath("//div[@id='popular-it-skill']/div/a"));
//					link3.click();
//					Thread.sleep(1000);
//					
				
				

	}

}
