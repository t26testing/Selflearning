package Selflearning;



import org.openqa.selenium.chrome.*;




public class LaunchChrome {
	public static void main(String[] arg)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selflearning.io/");
		Thread.sleep(1000);
		
		driver.close();
		
	}
	

}
