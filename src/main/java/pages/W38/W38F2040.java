package pages.W38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W38F2040 {
    public WebDriver driver;
    public W38F2040(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="/html/body/div[1]/div[1]/section/div[4]/div/section/form/div[2]/div[1]/div/button[1]")
    public WebElement btnThemMoi;
    public void clickThemMoi (){
        btnThemMoi.click();
    }

}
