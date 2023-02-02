package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFetchTitle {
   public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazone.com/");
	   driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("bags for man");
	   driver.findElement(By.cssSelector("#nav-search-submit-buttom")).click();
	   Thread.sleep(2000);
	   String result=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
	   System.out.println(result);
	   Thread.sleep(2000);
	   driver.quit();
}
}
