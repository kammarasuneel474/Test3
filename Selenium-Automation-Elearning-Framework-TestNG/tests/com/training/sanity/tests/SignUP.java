package com.training.sanity.tests;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.PasswordresetPOM;
import com.training.pom.SignUPPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import org.testng.annotations.Test;
public class SignUP {
    private WebDriver driver;
    private String baseUrl;
    private LoginPOM loginPOM;
    private PasswordresetPOM passwordresetPOM;
    private SignUPPOM signUPPOM;
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
        signUPPOM = new SignUPPOM(driver);
        baseUrl = properties.getProperty("baseURL");
        screenShot = new ScreenShot(driver); 
        // open the browser 
        driver.get(baseUrl);
    } 
    @Test(enabled=false)
    public void SignUp(){
    signUPPOM.signUp();
    signUPPOM.teachCources();
    signUPPOM.firstName();
    signUPPOM.lastName();
    signUPPOM.email();
    signUPPOM.userName();
    signUPPOM.password();
    signUPPOM.cpassword();
    signUPPOM.phone();
    signUPPOM.languagebutton();
    signUPPOM.language();
    signUPPOM.code();
    signUPPOM.skype();
    signUPPOM.linkedin();
    signUPPOM.register();
            
    }
}
 