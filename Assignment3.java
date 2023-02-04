package section1_selenium.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.selenium.dev/");
		  driver.get("https://www.google.co.in/");
		  
		  driver.quit();
	}		  
}
