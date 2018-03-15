package pages.W38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class W38F3000 {
    public WebDriver driver;

    public W38F3000(WebDriver driver){//This initElements method will create  all WebElements
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[4]/div/section[1]/form/div[4]/div/div/a")
    public WebElement btnThemMoi;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/div/div[1]/div[1]/button[2]")
    public WebElement btnClose;

    public void clickThemMoi(){
        btnThemMoi.click();
    }
    public void close_form() {
        btnClose.click();
    }

}
