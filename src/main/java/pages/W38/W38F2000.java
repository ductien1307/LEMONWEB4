package pages.W38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class W38F2000 {
    public WebDriver driver;
    public Select select;

    public W38F2000(WebDriver driver){//This initElements method will create  all WebElements
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "cboApprovalFlowIDW38F2000")
    public WebElement cboApprovalFlowIDW38F2000;

    @FindBy(id = "txtProposalName")
    public WebElement txtProposalName;

    @FindBy(id = "slTransIDW38F2000")
    public WebElement slTransIDW38F2000;

    @FindBy(id = "cboDepartmentID")
    public WebElement cboDepartmentID;

    @FindBy(id = "cboTrainingFieldID")
    public WebElement cboTrainingFieldID;

    @FindBy(id = "cboTeamID")
    public WebElement cboTeamID;

    @FindBy(id = "cboTrainingCourseID")
    public WebElement cboTrainingCourseID;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[1]/div[1]/button[2]/i")
    public WebElement btnClose;

    public void close_form() {
        try{
            btnClose.click();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
