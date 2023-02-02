package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigh {
	ChromeDriver driver;
	public static void main(String []args) throws InterruptedException
	{
		Assigh a=new Assigh();
		a.launchbrowser();
		a.login();
		Thread.sleep(2000);
		a.result();
		a.closebrowser();
	}
	public void launchbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}
	public void login() throws InterruptedException
	{
	    driver.get("https://www.google.com/");
	    driver.findElement(By.cssSelector("[title='Search']")).sendKeys("ipl");
	    Thread.sleep(2000);
	    driver.findElement(By.className("gNO89b")).click();
	 }
	public String result()
	{
		String result=driver.findElement(By.xpath("//div[@class='WE0UJf']/div/div")).getText();
		System.out.println(result);
		return result;
	}
	public void closebrowser()
	{
		driver.quit();
	}
}