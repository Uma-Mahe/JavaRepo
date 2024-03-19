package Assignment;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static void main(String[] args) {
		String driverPath = "C:\\Users\\Arthi\\git\\TestRepo\\drivers\\chromedriver.exe";

		System.setProperty("Webdriver.chrome.driver", driverPath);
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://google.com");
		int width=300;
		int height=500;
		Dimension dim = new Dimension(width, height);
		driver.manage().window().setSize(dim);
		driver.manage().window().maximize();
		driver.manage().window().minimize();

		System.out.println("Source code is : " + driver.getPageSource());
		System.out.println("______________________________________________________________________________________________");
		System.out.println("Page title is : "+ driver.getTitle());
		System.out.println("Current URL is : " + driver.getCurrentUrl());
		
		driver.close();
		driver.quit();
	
	}

}
