package com.training.sanity.tests;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.Coursecatalog1POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Coursecatalog1 {

	private WebDriver driver;
	private String baseUrl;
	private Coursecatalog1POM Coursecatalog1POM;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Coursecatalog1POM = new Coursecatalog1POM(driver); 
		loginPOM = new LoginPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	//suneel
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(enabled = false)
	public void coursecatalog1() {
		
		loginPOM.sendUserName("kammarasuneel");
		loginPOM.sendPassword("ibmibm818818");
		loginPOM.clickLoginBtn();
		Coursecatalog1POM.clickcoursecatalog();
		Coursecatalog1POM.searchbox("AKODDXD");
		Coursecatalog1POM.submitbutton();
		Coursecatalog1POM.subscribe();
	}
	
}
