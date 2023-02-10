package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {
    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
  	  WebDriver driver=new ChromeDriver();
      driver.get("https://demo.actitime.com/login.do");
      WebElement un= driver.findElement(By.cssSelector("[name='remeber']"));
      if(un.isSelected())
      {
    	  System.out.println("it is selected");
      }
       else
      {
    	  System.out.println("Its is not selected");
    	  driver.findElement(By.cssSelector("[name='remeber']")).click();  
      }
      
	}
}
