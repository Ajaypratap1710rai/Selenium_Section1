package section1_selenium.java;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic {
	ChromeDriver driver;
	public static void main(String []args) throws InterruptedException
	{
		Random r=new Random();
	    int num=r.nextInt(1000);
	    String actualcn="saurabh";
	    actualcn=actualcn+num;
		Generic g=new Generic();
		g.launchBrowser();
		g.login();
		Thread.sleep(2000);
		String expcustomername=g.customercreation(actualcn);
		System.out.println(expcustomername);
		if(actualcn.equals(expcustomername))
		{
			System.out.println("Test Case is paased");
		}
		else
		{
			System.out.println("Test Case is failed");
		}
		g.closeBrowser();
	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void login()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		driver.findElement(By.cssSelector("#loginButton")).click();
	}
	public String customercreation(String actualcn) throws InterruptedException
	{
		driver.findElement(By.cssSelector(".content.tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".addNewButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".item.createNewCustomer")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'newNameField')]")).sendKeys(actualcn);
        driver.findElement(By.cssSelector("[placeholder=\"Enter Customer Description\"]")).sendKeys("hello");
        driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
        Thread.sleep(2000);
        String expcustomername=driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']")).getText();
        return expcustomername;
	}
	public void closeBrowser()
	{
		driver.quit();
	}

}