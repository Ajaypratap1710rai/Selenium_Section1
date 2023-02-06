package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_assignment1 {
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
	  Thread.sleep(4000);
	  String title=driver.getTitle();
	  System.out.println(title);
	  driver.close();
}
}
