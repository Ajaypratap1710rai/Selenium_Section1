package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpath {
	ChromeDriver driver;
    public static void main(String[] args) throws InterruptedException {
    	String produnctname="APPLE iPhone X (Silver, 256 GB)";
    	FlipkartXpath fx=new FlipkartXpath();
    	fx.launchbrowser();
    	fx.login();
    	Thread.sleep(2000);
    	String price=fx.fetchprice(produnctname);
    	System.out.println(price);
    	fx.closebrowser();
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
	   	  driver.findElement(By.xpath("//button[text()='✕']")).click();
	   	  driver.findElement(By.name("q")).sendKeys("iphone x");
	   	  driver.findElement(By.cssSelector("[type='submit']")).click();
	   	  Thread.sleep(2000);
	}
	public String fetchprice(String produnctname) throws InterruptedException
	{
		String price=driver.findElement(By.xpath("//div[text()='"+produnctname+"']/../../div[2]/div[1]/div[1]/div")).getText();
		Thread.sleep(1000);
		return price;
	}	
		
	public void closebrowser()
	{
		driver.close();
	}
	
}
