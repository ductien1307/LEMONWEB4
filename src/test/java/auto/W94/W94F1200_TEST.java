package auto.W94;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.SQLException;
import auto.utility.TShared;
import pages.W94.W94F1200;


public class W94F1200_TEST extends TShared {

    @Test(priority = 1)
    public void W94F1200() throws InterruptedException, IOException, SQLException {
        W94F1200 objW94F1200 = new W94F1200(driver);
        test = extent.startTest("W38F2041");
        clickMenuHeThongThongTinQuanTri();
        clickMenuThietLapBaoCaoQuanTri();
        Thread.sleep(5000);
        objW94F1200.click_btnThemMoi();
        Thread.sleep(3000);
        objW94F1200.set_txtMReportID("NDT_002");
        objW94F1200.set_txtMReportNameU("Report NDT_002");
        objW94F1200.set_txtDisplayOrder("1");
        objW94F1200.set_cbbPlatformID("1");
        objW94F1200.set_cbbReportGroupID("G02");
        objW94F1200.set_txtReportFileName("R001");
        objW94F1200.set_txtRemarkU("note 01");

    }

}

