package section1_selenium.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
 public static void main(String[] args) {
	//Configure the browser server
	 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 //Launch chromeDriver
	 ChromeDriver driver=new ChromeDriver();
	 
	 //open flipkart application
	 driver.get("https://www.cowin.gov.in/");
	 
	 //Amazone page:-
	 //driver.get("https://www.amazon.in/");
}
}
