package section1_selenium.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
  public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.yatra.com/");
	  Thread.sleep(2000);
	  
      driver.get("https://www.amazon.in/");
      Thread.sleep(2000);
      
      driver.navigate().back();
      
      String title=driver.getTitle();
      System.out.println(title); 
      
      driver.navigate().forward();
      driver.manage().window().fullscreen();
}
}
