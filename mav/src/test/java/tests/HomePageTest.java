package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.BaseDriver;
import pages.HomePage;

public class HomePageTest extends BaseDriver{
	
	@Test(priority=3, groups="Sanity, Regression")
	public void singleInputFieldTest() throws InterruptedException {
		System.out.println("Starting singleInputFieldTest...");
		Thread.sleep(1000);
		
		String strToSend = "Shahar";
		HomePage.enterMessage.sendKeys(strToSend);
		HomePage.showMessageBtn.click();
		String text = HomePage.displayMessage.getText();
		
		System.out.println("Displayed text: " + text);
		
		Assert.assertTrue(text.equals(strToSend));
		System.out.println("Finished singleInputFieldTest - Passed");
	}
	
	@Test(priority=2)
	public void msgButtonTest() throws InterruptedException {
		System.out.println("Starting msgButtonTest...");
		Thread.sleep(1000);
		Assert.assertTrue(HomePage.showMessageBtn.isDisplayed());
		System.out.println("Finished msgButtonTest - Passed");
	}


	@BeforeMethod
	public void BeforeMethod() {
		startSession();
		PageFactory.initElements(driver, HomePage.class);
	}

	@AfterMethod
	public void AfterMethod() {
		stopSession();
	}
}
