package pages.W94;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class W94F1200 {
    public WebDriver driver;
    public Select select;

    public W94F1200(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"divD94F1200_W94F1200_W94F1200\"]/section[1]/div/div/div/a")
    public WebElement btnThemMoi;

    @FindBy(id = "txtMReportID")
    public WebElement txtMReportID;

    @FindBy(id = "txtMReportNameU")
    public WebElement txtMReportNameU;

    @FindBy(id = "txtDisplayOrder")
    public WebElement txtDisplayOrder;

    @FindBy(id = "cbbPlatformID")
    public WebElement cbbPlatformID;

    @FindBy(xpath = ".//*[@id='cbbReportGroupID']")
    public WebElement cbbReportGroupID;

    @FindBy(id = "txtReportFileName")
    public WebElement txtReportFileName;

    @FindBy(id = "txtRemarkU")
    public WebElement txtRemarkU;

    @FindBy(id = "divImage")
    public WebElement divImage;

    @FindBy(id = "chooseW94F1200")
    public WebElement chooseW94F1200;

    @FindBy(id = "resetW94F1200")
    public WebElement resetW94F1200;

    @FindBy(id = "frm_btnSave")
    public WebElement frm_btnSave;

    @FindBy(id = "frm_btnNext")
    public WebElement frm_btnNext;

    @FindBy(xpath = "//*[@id=\"frmD94F1200\"]/div[1]/div[1]/button[2]/i")
    public WebElement btn_close;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissable']")
    public WebElement success_save;

    @FindBy(xpath = ".//span[@id='err']")
    public WebElement err_save;

    public void set_txtMReportID(String txtMReportID){
        this.txtMReportID.sendKeys(txtMReportID);
    }
    public void set_txtMReportNameU(String txtMReportNameU){
        this.txtMReportNameU.sendKeys(txtMReportNameU);
    }
    public void set_txtDisplayOrder(String txtDisplayOrder){
        this.txtDisplayOrder.sendKeys(txtDisplayOrder);
    }
    public void set_cbbPlatformID(String cbbPlatformID){
         this.cbbPlatformID.click();
         select = new Select(this.cbbPlatformID);
         select.selectByValue(cbbPlatformID);
    }
    public void set_cbbReportGroupID(String cbbReportGroupID){
        this.cbbReportGroupID.click();
        select = new Select(this.cbbReportGroupID);
        select.selectByValue(cbbReportGroupID);
    }
    public void set_txtReportFileName(String txtReportFileName){
        this.txtReportFileName.sendKeys(txtReportFileName);
    }
    public void set_txtRemarkU(String txtRemarkU){
        this.txtRemarkU.sendKeys(txtRemarkU);
    }
    public void click_chooseW94F1200(){
        this.chooseW94F1200.click();
    }
    public void click_resetW94F1200(){
        this.resetW94F1200.click();
    }
    public void click_frm_btnSave(){
        this.frm_btnSave.click();
    }
    public void click_frm_btnNext(){
        this.frm_btnNext.click();
    }
    public void click_btnThemMoi(){
        this.btnThemMoi.click();
    }
    public void click_btn_close(){
        this.btn_close.click();
    }
    public String get_success_save(){
        return success_save.getText();
    }
    public String get_err_save(){
        return err_save.getText();
    }
}
