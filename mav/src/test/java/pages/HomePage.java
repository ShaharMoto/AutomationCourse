package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;

	// Enter message field
	@FindBy(xpath = "//input[@type='text' and @id='user-message']")
	public static WebElement enterMessage;
	
	// Show message button
	@FindBy(xpath = "//*[@id='get-input']/button")
	public static WebElement showMessageBtn;
	
	// Display message box
	@FindBy(id = "display")
	public static WebElement displayMessage;
	
	// Enter 1st number to calculate sum
	@FindBy(xpath = "//input[@type='text' and @id='sum1']")
	public static WebElement enterNumA;
	
	// Enter 2nd number to calculate sum
	@FindBy(xpath = "//input[@type='text' and @id='sum2']")
	public static WebElement enterNumB;
	
	// Get Total button
	@FindBy(xpath = "//button[@onclick='return total()']")
//	@FindBy(xpath = "//button[contains(text(), 'Get Total')]") // optional
	public static WebElement calcSumBtn;
}
