package com.training.sanity.tests;
import org.testng.annotations.*;

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
import com.training.pom.PasswordresetPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class PasswordReset {

		private WebDriver driver;
		private String baseUrl;
		private LoginPOM loginPOM;
		private PasswordresetPOM PasswordresetPOM;
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
			loginPOM = new LoginPOM(driver);
			PasswordresetPOM = new PasswordresetPOM(driver);
			baseUrl = properties.getProperty("baseURL");
			screenShot = new ScreenShot(driver); 
			// open the browser 
			driver.get(baseUrl);
		}
		
	//	@AfterMethod
	//	public void tearDown() throws Exception {
	//		Thread.sleep(1000);
	//		driver.quit();
	//	}
		
		//hellosuneel
		@Test(enabled=false)
		public void validLoginTest() {
			
			PasswordresetPOM.PasswordresetBtn();
			PasswordresetPOM.enteremail("kammara.suneel474@gmail.com");
			PasswordresetPOM.sendmsg();
			}
	}
