package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class genflip {

	ChromeDriver driver;
	public static void main(String[]args) throws InterruptedException
	   {
		genflip f=new genflip();
		f.launchbrowser();
		f.login();
		f.closelogin();
		f.fetchprice();
		f.closeBrowser();
		 
	   }
		public void launchbrowser()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		public void login() throws InterruptedException
		{
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
		}
		public void fetchprice() throws InterruptedException
		{
			  driver.findElement(By.name("q")).sendKeys("iphone x");
			  driver.findElement(By.cssSelector("[type='submit']")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		}
		public void closelogin() throws InterruptedException
		{
			  driver.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
		}
		public void closeBrowser()
		   {
			   driver.close();
		   }
}
