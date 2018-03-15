package auto.WP;
import org.testng.annotations.*;
import java.io.IOException;

import auto.utility.TShared;
import pages.W38.W38F2041;
import pages.W38.W38F3000;
import pages.W38.W38F2040;
import pages.W38.W38F2000;

public class Verify_control extends TShared {
    @Test(priority=1)
    public void W38F2041() throws InterruptedException, IOException {
        test = extent.startTest("W38F2041");
        W38F2040 objW38F2040 = new W38F2040(driver);
        W38F2041 objW38F2041 = new W38F2041(driver);
        Thread.sleep(2000);
        clickMenuDaoTao();
        Thread.sleep(2000);
        clickMenuKeHoachDaoTaoTongThe();
        waitUntilToBeClickAble(objW38F2040.btnThemMoi);
        objW38F2040.clickThemMoi();
        Thread.sleep(2000);
        verify_control(PATH_TESTDATA,"W38F2041.xlsx","Required");
        objW38F2041.close_form();
    }
    @Test(priority=2)
    public void W38F2000() throws InterruptedException, IOException {
        test = extent.startTest("W38F2000");
        W38F3000 objW38F3000 = new W38F3000(driver);
        W38F2000 objW38F2000 = new W38F2000(driver);
        clickMenuDeXuatDaoTao();
        objW38F3000.clickThemMoi();
        verify_control(PATH_TESTDATA,"W38F2000.xlsx","Required");
        objW38F2000.close_form();
    }
    }



