package ui_tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import web_driver.DriverManager;

public class BaseTest {


    protected WebDriver driver = DriverManager.getDriver();

    @AfterTest
    public void kill(){
        DriverManager.closeDriver();
    }
}
