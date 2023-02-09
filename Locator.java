package section1_selenium.java;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
     public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   	  ChromeDriver driver=new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.get("https://demo.actitime.com/login.do");
   	  
   	  //USERNAME Textbox --------->
	  //By usernameLoc=By.id("username");
   	  //WebElement username=driver.findElement(usernameLoc);
   	  //username.sendKeys("admin");
   	  driver.findElement(By.id("username")).sendKeys("admin");
   	      
	  //PASSWORD--------->
   	  //By passwordLoc=By.name("pwd");
   	  //WebElement password=driver.findElement(passwordLoc);
   	  //password.sendKeys("manager");
   	  driver.findElement(By.name("pwd")).sendKeys("manager");
   	  
   	  //LOGIN---------->
   	  driver.findElement(By.id("loginbutton")).click();
	}
}
