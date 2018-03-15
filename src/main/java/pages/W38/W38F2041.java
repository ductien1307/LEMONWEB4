package pages.W38;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class W38F2041 {
    public WebDriver driver;
    public Select select;

    @FindBy(id = "slApprovalFlowIDW38F2041")
    public WebElement slApprovalFlowIDW38F2041;

    @FindBy(id = "slTrainingFieldIDW38F2041")
    public WebElement slTrainingFieldIDW38F2041;

    @FindBy(id = "slTrainingCourseIDW38F2041")
    public WebElement slTrainingCourseIDW38F2041;

    @FindBy(id = "txtTrainingObjectNameW38F2041")
    public WebElement txtTrainingObjectNameW38F2041;

    @FindBy(id = "txtTrainningEmpNameW38F2041")
    public WebElement txtTrainningEmpNameW38F2041;

    @FindBy(id = "txtContentW38F2041")
    public WebElement txtContentW38F2041;

    @FindBy(id = "txtTrainingPurposeW38F2041")
    public WebElement txtTrainingPurposeW38F2041;

    @FindBy(id = "txtDateFromW38F2041")
    public WebElement txtDateFromW38F2041;

    @FindBy(id = "txtDateToW38F2041")
    public WebElement txtDateToW38F2041;

    @FindBy(id = "txtProNumberW38F2041")
    public WebElement txtProNumberW38F2041;

    @FindBy(id = "txtProCostW38F2041")
    public WebElement txtProCostW38F2041;


    @FindBy(id = "txtProCompanyRateW38F2041")
    public WebElement txtProCompanyRateW38F2041;

    @FindBy(id = "txtProAverageCostsW38F2041")
    public WebElement txtProAverageCostsW38F2041;

    @FindBy(id = "slProCurrencyIDW38F2041")
    public WebElement slProCurrencyIDW38F2041;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div[1]/button[2]/i")
    public WebElement btnClose;

    @FindBy(id = "txtProCCostW38F2041")
    public WebElement txtProCCostW38F2041;

    @FindBy(id = "txtProposalNameW38F2041")
    public WebElement txtProposalNameW38F2041;

    @FindBy(id = "txtProNoteW38F2041")
    public WebElement txtProNoteW38F2041;

    @FindBy(id = "btnSaveW38F2041")
    public WebElement btnSaveW38F2041;

    @FindBy(id = "btnNotSaveW38F2041")
    public WebElement btnNotSaveW38F2041;

    @FindBy(id = "btnNextW38F2041")
    public WebElement btnNextW38F2041;

    @FindBy(xpath = "/html/body/div[14]/div/div[3]/button[1]")
    public WebElement btnSaveOK;

    @FindBy(xpath = "/html/body/div[14]/div/div[3]/button[2]")
    public WebElement btnSaveNo;

    @FindBy(xpath = "/html/body/div[14]/div/div[3]/button")
    public WebElement alertOKYes;

    public W38F2041(WebDriver driver) {//This initElements method will create  all WebElements
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void set_slApprovalFlowIDW38F2041(String strApprovalFlowIDW38F2041) {
        Select slApprovalFlowID = new Select(slApprovalFlowIDW38F2041);
        slApprovalFlowID.selectByValue(strApprovalFlowIDW38F2041);
    }

    public void set_slTrainingFieldIDW38F2041(String strTrainingFieldIDW38F2041) {
        Select slTrainingFieldID = new Select(slTrainingFieldIDW38F2041);
        slTrainingFieldID.selectByVisibleText(strTrainingFieldIDW38F2041);
    }

    public void set_slTrainingCourseIDW38F2041(String strTrainingCourseIDW38F2041) {
        Select slTrainingCourse = new Select(slTrainingCourseIDW38F2041);
        slTrainingCourse.selectByVisibleText(strTrainingCourseIDW38F2041);
    }

    public void set_slProCurrencyIDW38F2041(String slProCurrencyIDW38F2041) {
        select = new Select(this.slProCurrencyIDW38F2041);
        select.selectByValue(slProCurrencyIDW38F2041);
    }

    public String get_slProCurrencyIDW38F2041() {
        select = new Select(this.slProCurrencyIDW38F2041);
        return select.getFirstSelectedOption().getAttribute("exchangerate");
    }

    public String get_txtTrainingObjectNameW38F2041() {
        return txtTrainingObjectNameW38F2041.getAttribute("value");
    }

    public String get_txtTrainningEmpNameW38F2041() {
        return txtTrainningEmpNameW38F2041.getAttribute("value");
    }

    public String get_txtContentW38F2041() {
        return txtContentW38F2041.getAttribute("value");
    }

    public String get_txtTrainingPurposeW38F2041() {
        return txtTrainingPurposeW38F2041.getAttribute("value");
    }

    public String get_txtDateFromW38F2041() {
        return txtDateFromW38F2041.getAttribute("value");
    }

    public String get_txtDateToW38F2041() {
        return txtDateToW38F2041.getAttribute("value");
    }

    public String get_txtProAverageCostsW38F2041() {
        return txtProAverageCostsW38F2041.getAttribute("value");
    }

    public String get_txtProCCostW38F2041() {
        return txtProCCostW38F2041.getAttribute("value");
    }

    public void set_txtProNoteW38F2041(String txtProNoteW38F2041) {
        this.txtProNoteW38F2041.sendKeys(txtProNoteW38F2041);
    }

    public void set_txtProposalNameW38F2041(String txtProposalNameW38F2041) {
        this.txtProposalNameW38F2041.sendKeys(txtProposalNameW38F2041);
    }

    public void set_txtProNumberW38F2041(String txtProNumberW38F2041) {
        this.txtProNumberW38F2041.sendKeys(txtProNumberW38F2041);
    }

    public void set_txtProCostW38F2041(String txtProCostW38F2041) {
        this.txtProCostW38F2041.sendKeys(txtProCostW38F2041);
    }

    public void set_txtProCompanyRateW38F2041(String txtProCompanyRateW38F2041) {
        this.txtProCompanyRateW38F2041.sendKeys(txtProCompanyRateW38F2041);
    }

    public void set_txtProAverageCostsW38F2041(String txtProAverageCostsW38F2041) {
        this.txtProAverageCostsW38F2041.sendKeys(txtProAverageCostsW38F2041);
    }

    public void close_form() {
        btnClose.click();
    }

    public void clear_form() {
        this.txtProNumberW38F2041.clear();
        this.txtProCostW38F2041.clear();
        this.txtProCompanyRateW38F2041.clear();
        set_slProCurrencyIDW38F2041("");
    }

    public void click_btnSave() {
        btnSaveW38F2041.click();
    }

    public void click_messSaveNo() {
        btnSaveNo.click();
    }

    public void click_messSaveYes() {
        btnSaveOK.click();
    }

}
