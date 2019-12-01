package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utils.PropertyUtils;

public class BaseDriver {

	public WebDriver driver;
	String path = System.getProperty("user.dir");

//	public WebDriver getDriver() {
//		return driver;
//	}
	
	public void startSession() {
		try 
		{
			PropertyUtils pus = new PropertyUtils(path + "\\selenium.properties");
			String browser = pus.getProperty("browser");
			String URL = pus.getProperty("URL");
			
			if (browser.equalsIgnoreCase("FireFox")) {
				System.setProperty("webdriver.gekodriver.driver", "C:\\Users\\AutoMILS\\Downloads\\installation_files\\firefox_driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\AutoMILS\\Downloads\\installation_files\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("ie")) { 
				System.setProperty("webdriver.ie.driver", "C:\\Users\\AutoMILS\\Downloads\\installation_files\\iexplorer_driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			else {
				
			}
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(URL);
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void stopSession() {
		driver.quit();
	}
	
}
