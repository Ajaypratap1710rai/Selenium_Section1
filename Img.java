package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Img {
	WebDriver driver;
	public static void main(String []args) throws InterruptedException
	{
		Img i=new Img();
		i.launchBrowser();
		i.login();
		i.close();
			
	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KARTHIK MOBILES\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}
	public void login() throws InterruptedException
	{
		driver.get("https://www.google.com/");
		WebElement img=driver.findElement(By.className("Gdd5U"));
		String srcvalue=img.getAttribute("src");
		System.out.println("scr:"+srcvalue);
	}
	public void close()
	{
		driver.quit();
	}

}
