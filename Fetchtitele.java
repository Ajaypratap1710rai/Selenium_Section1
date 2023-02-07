package section1_selenium.java;

//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchtitele {
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  
	  
	  //title:-
	  //String title=driver.getTitle();
	  //System.out.println(title);       //Google
	  
	  //Get Current URl:-
	  //String url=driver.getCurrentUrl();
	  //System.out.println(url);         //https://www.google.co.in/
	  
	  //Get Source Code:-
      //String sc=driver.getPageSource();
      //System.out.println(sc);   	
	  
	  //Maximize();
	  //driver.manage().window().maximize();
	  //driver.get("https://www.google.co.in/");
	  
	  //Minimize();
	  //driver.manage().window().minimize();
	  //driver.get("https://www.google.co.in/");
	  
	  //fullScreen();
	  //driver.manage().window().maximize();
	  //driver.get("https://www.google.co.in/");
	  //driver.manage().window().fullscreen();
	  
	  //setSize();
	  //driver.manage().window().maximize();
	  //driver.get("https://www.google.co.in/");
	  //driver.manage().window().setSize(new Dimension(400,600));
	  
	  //setPosition();
	  //driver.manage().window().maximize();
	  //driver.get("https://www.google.co.in/");
	  //driver.manage().window().setPosition(new Point(100,200));
	  
	  //Back()
	  //driver.navigate().back();
	  
	  //Forward()
	  //driver.navigate().forward();
	  
	  //Refresh()
	  //driver.navigate().refresh();
	  
  }
}
