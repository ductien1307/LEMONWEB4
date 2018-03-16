package pages.WP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Layout {

    @FindBy(xpath="/html/body/div[1]/aside/section/div[1]/div/ul/li[4]/a/span")
    public WebElement menuDaoTao;

    @FindBy(xpath="/html/body/div[1]/aside/section/div[1]/div/ul/li[4]/ul/li[3]/a")
    public WebElement menuKeHoachDaoTaoTongThe;

    @FindBy(xpath="/html/body/div[1]/aside/section/div[1]/div/ul/li[4]/ul/li[1]/a")
    public WebElement menuDeXuatDaoTao;

    @FindBy(xpath="//*[@id=\"mCSB_1_container\"]/ul/li[4]/ul/li[1]/a")
    public WebElement menuKeHoachDaoTaoNam;

    @FindBy(xpath="//*[@id=\"mCSB_1_container\"]/ul/li[1]/a/span")
    public WebElement menuHeThongThongTinQuanTri;

    @FindBy(xpath="//*[@id=\"mCSB_1_container\"]/ul/li[1]/ul/li[2]/a")
    public WebElement menuThietLapBaoCaoQuanTri;

    public void clickMenuDaoTao (){
        menuDaoTao.click();
    }
    public void clickMenuKeHoachDaoTaoTongThe (){
        menuKeHoachDaoTaoTongThe.click();
    }
    public void clickMenuDeXuatDaoTao (){
        menuDeXuatDaoTao.click();
    }
    public void clickMenuKeHoachDaoTaoNam (){
        menuKeHoachDaoTaoNam.click();
    }
    public void clickMenuHeThongThongTinQuanTri (){
        menuHeThongThongTinQuanTri.click();
    }
    public void clickMenuThietLapBaoCaoQuanTri (){
        menuThietLapBaoCaoQuanTri.click();
    }
}
