package auto.W94;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import auto.utility.TShared;
import pages.W94.W94F1200;



public class W94F1200_TEST extends TShared {
    WebElement element;
    @Test(priority = 1)
    public void W94F1200() throws InterruptedException, IOException, SQLException, AWTException {
        Random ran = new Random();
        int n = ran.nextInt(6) + 5;

        W94F1200 objW94F1200 = new W94F1200(driver);
        test = extent.startTest("W38F2041");
        clickMenuHeThongThongTinQuanTri();
        clickMenuThietLapBaoCaoQuanTri();
        Thread.sleep(5000);

        objW94F1200.click_btnThemMoi();
        Thread.sleep(1000);//NDT_7
        objW94F1200.set_txtMReportID("NDT_" + n);
        //objW94F1200.set_txtMReportID("NDT_7");
        objW94F1200.set_txtMReportNameU("Report NDT_002");

        objW94F1200.set_txtDisplayOrder("1");
        Thread.sleep(1000);
        objW94F1200.set_cbbPlatformID("1");
        objW94F1200.set_cbbReportGroupID("G02");

        objW94F1200.set_txtReportFileName("R001");
        objW94F1200.set_txtRemarkU("note 01");
        objW94F1200.click_chooseW94F1200();


        Robot robot = new Robot();
        StringSelection stringselection = new StringSelection(PATH_IMAGES + "image.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER );
        robot.keyRelease(KeyEvent.VK_ENTER );

        objW94F1200.click_frm_btnSave();
        try{
            element = waitForElement(10,objW94F1200.success_save);
            String success_save = element.getText();
            System.out.println(success_save);
            if(success_save == "Dữ liệu đã được lưu thành công."){
                test.log(LogStatus.PASS,"Pass");
            }
        }catch (Exception e){
            test.log(LogStatus.FAIL,"Fail");
        }
    }

}

