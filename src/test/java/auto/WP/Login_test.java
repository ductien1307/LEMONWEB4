package auto.WP;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.WP.Login;

import java.util.concurrent.TimeUnit;


public class Login_test {
    Login objSetup;
    WebDriver driver;

    @BeforeTest()
    public void setup(){
        System.setProperty("webdriver.gecko.driver","D:\\PROJECT\\LEMONWEB\\geckodriver.exe");
        this.driver = new FirefoxDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.get("http://apricot.diginet.com.vn:4000/lw4auto/login");
        objSetup = new Login(driver);
    }
    @Test(priority=1)
    public void WP01() throws InterruptedException {
        objSetup.clickLogin();
        String message = objSetup.txtUserName.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("Bạn phải nhập dữ liệu"));
    }
    @Test(priority=2)
    public void WP02() throws InterruptedException {
        objSetup.clickLogin();
        String message = objSetup.txtPassWord.getAttribute("validationMessage");
        Assert.assertTrue(message.contains("Bạn phải nhập dữ liệu"));
    }
    @Test(priority=3)
    public void WP03() throws InterruptedException {
        objSetup.setUserName("ABC");
        objSetup.setPassWord("CDE");
        objSetup.clickLogin();
        String mess_error = objSetup.messError.getText();
        Assert.assertTrue(mess_error.contains("Bạn không có quyền đăng nhập vào LemonWeb"));
    }
    @Test(priority=4)
    public void WP04() throws InterruptedException {
        objSetup.setUserName("dlq0401");
        objSetup.setPassWord("123");
        objSetup.clickLogin();
        String title_login = driver.getTitle();
        Assert.assertTrue(title_login.contains("LemonWeb 4.0"));
    }

    @AfterTest()
    public void exit(){
        //objSetup.close_app();
    }
}
