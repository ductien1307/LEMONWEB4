package pages.WP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Login {
    public WebDriver driver;
    @FindBy(id="txtUsernameFake")
    public WebElement txtUserName;

    @FindBy(id="txtPasswordFake")
    public WebElement txtPassWord;

    @FindBy(id="btnLogin")
    public WebElement btnLogin;

    @FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div[2]/div/div[2]/form[2]/div/div[1]/label/i/u")
    public WebElement linkChonDoanhNghiep;

    @FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div[2]/div/div[2]/form[1]/div[2]/label")
    public WebElement messError;


    @FindBy(xpath="/html/body/div[1]/aside/section/div[1]/div/ul/li[4]/ul/li[3]/a")
    public WebElement menuKeHoachDaoTaoTongThe;

    public void setUserName(String strUserName){
        this.txtUserName.sendKeys(strUserName);
    }
    public void setPassWord(String strPassWord){
        this.txtPassWord.sendKeys(strPassWord);
    }
    public void clickLogin(){
        btnLogin.click();
    }
    public void login_system(String strUserName, String strPassWord) throws InterruptedException {
        this.setUserName(strUserName);
        this.setPassWord(strPassWord);
        this.clickLogin();
    }
    public Login(WebDriver driver){//This initElements method will create  all WebElements
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public boolean test_account(String strUserName, String strPassWord) throws InterruptedException {
        this.setUserName(strUserName);
        this.setPassWord(strPassWord);
        this.clickLogin();
        String str_title = driver.getTitle();

        if(str_title.equals("LemonWeb"))
            return false;
        else
            return true;

    }
}
