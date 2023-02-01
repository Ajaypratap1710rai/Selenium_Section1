package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeFetchTitle {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.actitime.com/login.do");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
	  driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
	  driver.findElement(By.cssSelector("[type='checkbox']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("[id='loginButton']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("[class='content tasks']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[text()='Add New']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("[class='item createNewCustomer']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("[class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("Vishal");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("WebElement");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	  Thread.sleep(2000);
	  String text=driver.findElement(By.cssSelector(".titleEditButtomContainer")).getText();
	  System.out.println(text);
	  Thread.sleep(2000);
	  String actualcn=("Vishal");
	  String expcn=(text);
	  if(actualcn.equals(expcn))
	  {
		  System.out.println("Test Case pass");
	  }
	  else
	  {
		  System.out.println("Test case Failed");
	  }
	  Thread.sleep(2000);
	  driver.quit();
	  
}
}
