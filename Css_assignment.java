package section1_selenium.java;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Css_assignment {
    public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
   	  ChromeDriver driver=new ChromeDriver();
   	  driver.manage().window().maximize();
   	  driver.get("https://www.flipkart.com/");
   	  Thread.sleep(2000);
   	  driver.findElement(By.cssSelector("[class='_2KpZ6l _2doB4z']")).click();
   	  Thread.sleep(1000);
   	  driver.findElement(By.name("q")).sendKeys("nokia");
   	  Thread.sleep(1000);
   	  driver.findElement(By.className("L0Z3Pu")).click();
   	  Thread.sleep(1000);
   	  String title=driver.getTitle();
   	  System.out.println(title);
   			 
	}
}
