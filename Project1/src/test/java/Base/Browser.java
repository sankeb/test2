package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {

	public static WebDriver openChromeBrowser(){
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sanke\\git\\Batch24\\Project1\\src\\test\\resources\\browser\\chromedriver.exe");		
	 WebDriver driver = new ChromeDriver();
     return driver ;
	}
	
	public static WebDriver openEgdeBrowser () {
	 System.setProperty("webdriver.edge.driver", "C:\\Users\\sanke\\git\\Batch24\\Project1\\src\\test\\resources\\browser\\msedgedriver.exe");
	 WebDriver driver = new EdgeDriver();
	 return driver ;
	
	
	
}
}