package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAriaRole {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.google.co.in/");
	   
	   WebElement hindi=driver.findElement(By.linkText("हिन�?दी"));
	   String role=hindi.getAriaRole();
	   System.out.println(role);
	   
	   
	   WebElement google=driver.findElement(By.className("lnXdqd"));
	   System.out.println(google);
  }
}
