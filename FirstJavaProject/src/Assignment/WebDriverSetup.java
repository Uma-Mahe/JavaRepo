package Assignment;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverSetup {
	public static void main(String[] args) {
		String driverPath = "C:\\Users\\Arthi\\git\\TestRepo\\drivers\\chromedriver.exe";
		System.setProperty("Webdriver.chrome.driver", driverPath);
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		String driverPath1 = "C:\\Users\\Arthi\\git\\TestRepo\\drivers\\geckodriver.exe";
		System.setProperty("Webdriver.gecko.driver", driverPath1);
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("http://google.com");
		driver1.manage().window().maximize();
		
		String driverpath2 = "C:\\Users\\Arthi\\git\\TestRepo\\drivers\\msedgedriver.exe";
		System.setProperty("Webdriver.edge.driver", driverpath2);
		WebDriver driver2 = new EdgeDriver();
		driver2.get("http://google.com");
		driver2.manage().window().maximize();
	}
}
