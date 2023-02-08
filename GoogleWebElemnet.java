package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleWebElemnet {
    public static void main(String[] args) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
     	  WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.co.in/");
         WebElement search=driver.findElement(By.name("q"));
         search.sendKeys("Virat");
         Thread.sleep(2000);
         search.clear();
         Thread.sleep(1000);
         search.sendKeys("Dhoni");
         Thread.sleep(2000);
         search.submit();
	}
}
