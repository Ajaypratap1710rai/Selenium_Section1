package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fontsize {
    WebDriver driver;
    public static void main(String[]args) throws InterruptedException
    {
    	Fontsize f=new Fontsize();
    	f.launchBrowser();
    	f.login();
		String fontsize1="13px";
        String fontsize=f.getfontsize();
    	System.out.println(fontsize);
    	if(fontsize.equals(fontsize1))
    	{
    		System.out.println("test case is passed");
    	}
    	else
    	{
    		System.out.println("test case is failed");
    	}
    	f.close();

    }
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KARTHIK MOBILES\\Documents\\selenium\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}
	public void login() throws InterruptedException
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
	}
	public String getfontsize()
	{
		WebElement errormsg=driver.findElement(By.xpath("//span[contains(text(),'Username or Password')]"));
		String fontsize=errormsg.getCssValue("font-size");
		return fontsize;

	}
	public void close()
	{
		driver.quit();
	}
}
