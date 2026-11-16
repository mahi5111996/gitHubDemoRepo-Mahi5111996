package selenuimGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ParallelTest {
	public WebDriver driver;
	
	@Parameters({"bName"})
  @Test
  public void crossBrowserTest(String bName) throws InterruptedException, MalformedURLException {
		
		System.out.println("Remote Driver Connectivity - Started");
		
	  if(bName.equals("Chrome")) {
		  ChromeOptions options = new ChromeOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  //driver = new ChromeDriver();
	  }else if(bName.equals("Firefox")){
		  //driver = new FirefoxDriver();
		  
		  FirefoxOptions options = new FirefoxOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  
	  }else if(bName.equals("Edge")) {
		  //driver = new EdgeDriver();
		  
		  EdgeOptions options = new EdgeOptions();
		  driver = new RemoteWebDriver(new URL("http://localhost:4444"),options);
	  }
	  
	  System.out.println("Remote Driver Connectivity - Completed");
	  
	  
	  driver.manage().window().maximize();
	  Thread.sleep(10000);
	  
	  driver.get("https://www.amazon.in/");
	  Thread.sleep(5000);
	  System.out.println("Title is : "+bName+" :"+driver.getTitle());
	  
	  driver.quit();
	  
  }
}
