package section1_selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldometer {
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Worldometer w=new Worldometer();
		w.launch();
		w.worldometer();
        w.number1();
		w.number2();
		w.number3();
		Thread.sleep(2000);
		w.close();
		
	}
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void worldometer() throws InterruptedException
	{
		driver.get("https://www.worldometers.info/coronavirus/");
		Thread.sleep(2000);
	}
    public String number1()
    {
     String result1=driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/../div/span")).getText();
     System.out.println("The total coronavirus cases in the world is "+result1);
     return result1;
    }
    public String number2()
    {
    String result2=driver.findElement(By.xpath("//h1[text()='Deaths:']/../div")).getText();
    System.out.println("The total death due to coronavirus in the world is "+result2);
    return result2;
    }
    public String number3()
    { 
     String result3=driver.findElement(By.xpath("//h1[text()='Recovered:']/../div")).getText();
    	System.out.println("The total number of recovered people from coronavirus in the world is "+result3);
    	return result3;
    	
    	
    }
    public void close()
    {
    	driver.quit();
    }
}