package auto.utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.WP.Layout;
import pages.WP.Login;


public class TShared extends Layout{
    public WebDriver driver;
    public WebDriverWait wait;

    public ExtentReports extent;
    public ExtentTest test;

    public Excel objExcel;
    public Login objLogin;

/*
    public final String URL_TEST = "http://apricot.diginet.com.vn:4000/lw4auto/login";
    public final String USER_NAME = "dlq0401";
    public final String USER_PASS = "123";
*/


    public final String URL_TEST = "http://apricot.diginet.com.vn:4000/lw4demo/login";
    public final String USER_NAME = "lwadmin";
    public final String USER_PASS = "123";

    public final String PATH_SYSTEM = System.getProperty("user.dir");
    public final String PATH_GECKO_DRIVER = PATH_SYSTEM + "\\geckodriver.exe";
    public final String PATH_TESTDATA = PATH_SYSTEM + "\\src\\main\\resources\\testdata";
    public final String PATH_REPORT = PATH_SYSTEM + "\\src\\main\\resources\\report\\report.html";
    public final String PATH_IMAGES = PATH_SYSTEM + "\\src\\main\\resources\\images\\";

    public final String STR_VALIDATE_SEL_EN = "Please select an item in the list.";
    public final String STR_VALIDATE_TEXTBOX_EN = "Please fill out this field.";

    public void close_app(){
        driver.close();
    }

    public void waitUntilToBeClickAble(WebElement ele) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(ele));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getValidationMessage(WebElement element){
        return element.getAttribute("validationMessage");
    }
    public Boolean getAttribute(WebElement element){

        return Boolean.parseBoolean(element.getAttribute("required"));
    }
    public Boolean checkEnabled(WebElement element){
        return element.isEnabled();
    }
    public Integer format_string_to_int(String str_num){
        String str_num_temp = String.format("%.0f",Double.parseDouble(str_num));
        Integer num_int = Integer.parseInt(str_num_temp);
        return num_int;
    }

    public void verify_control(String filePath, String fileName, String sheetName) throws InterruptedException, IOException {
        objExcel = new Excel();
        Sheet lwSheet = objExcel.get_data_sheet_excel(filePath, fileName, sheetName);
        int rowCount = lwSheet.getLastRowNum() - lwSheet.getFirstRowNum();
        for (int i = 2; i <= rowCount; i++) {
            Row row = lwSheet.getRow(i);
            String cell_title = objExcel.getExcelCellString(row.getCell(0));
            String temp = objExcel.getExcelCellString(row.getCell(6));
            String atr_required = objExcel.getExcelCellString(row.getCell(4));
            Integer required_int = format_string_to_int(atr_required);
            Boolean flag = driver.findElements(By.id(temp)).size() > 0;
            if(flag == true ){
                WebElement element = driver.findElement(By.id(temp));
                Boolean required = getAttribute(element);
                System.out.println(required);
                if(required_int == 1 && required == false) {
                    test.log(LogStatus.PASS, cell_title);
                }else if(required_int == 0 && required == true){
                    test.log(LogStatus.FAIL, cell_title);
                }else{
                    test.log(LogStatus.FAIL, cell_title);
                }
            }
        }

    }

    @BeforeClass()
    public void setup() throws InterruptedException {
        //System.out.println("BeforeClass");
    }

    @AfterMethod
    protected void afterMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(LogStatus.FAIL, result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
        } else {
            //test.log(LogStatus.PASS, "Test passed");
        }
        extent.endTest(test);
        extent.flush();
    }

    @BeforeSuite
    public void beforeSuite() throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver",PATH_GECKO_DRIVER);
        this.driver = new FirefoxDriver();
        this.driver.get(URL_TEST);
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        this.driver = driver;
        PageFactory.initElements(driver,this);

        objLogin = new Login(driver);
        objLogin.login_system(USER_NAME, USER_PASS);
        extent = ExtentManager.getReporter(PATH_REPORT);
    }

    @AfterSuite
    protected void afterSuite() throws InterruptedException {
        extent.close();
        //Thread.sleep(3000);
        //driver.quit();
        //close_app();
    }
}

