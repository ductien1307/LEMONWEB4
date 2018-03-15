package auto.W38;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import auto.utility.TShared;
import auto.utility.DataBase;
import pages.W38.W38F2000;
import pages.W38.W38F2041;
import pages.W38.W38F2040;

public class W38F2041_TEST extends TShared {

/* @Test(enabled = false)
 private void W38F2041_008()  throws InterruptedException {
         objW38F2040.clickThemMoi();
         Thread.sleep(1000);
         objW38F2041 = new W38F2041(driver);
         objW38F2041.set_slTrainingFieldIDW38F2041("Kinh tế");
         objW38F2041.set_slTrainingCourseIDW38F2041("Khóa đào tạo 2");
         Thread.sleep(1000);
         String strTrainingObjectName = objW38F2041.get_txtTrainingObjectNameW38F2041();
         String strTrainningEmpName = objW38F2041.get_txtTrainningEmpNameW38F2041();
         String strContent = objW38F2041.get_txtContentW38F2041();
         String strTrainingPurpose = objW38F2041.get_txtTrainingPurposeW38F2041();
         String strDateFrom = objW38F2041.get_txtDateFromW38F2041();
         String strDateTo = objW38F2041.get_txtDateToW38F2041();

         Assert.assertTrue(strTrainingObjectName.contains("WORKER"));
         Assert.assertTrue(strTrainningEmpName.contains("BÙI ĐÌNH ĐỨC"));
         Assert.assertTrue(strContent.contains("Đào tạo nâng tay nghề cho nhân viên"));
         Assert.assertTrue(strTrainingPurpose.contains("đào tạo chuyên môn"));
         Assert.assertTrue(strDateFrom.contains("01/11/2017"));
         Assert.assertTrue(strDateTo.contains("24/11/2018"));
         objW38F2041.close_form();
     }

@Test(enabled = false)
public void W38F2041_001() throws InterruptedException {
        objW38F2040.clickThemMoi();
        Thread.sleep(2000);

        String validationMessageApprovalFlowID = objShared.getValidationMessage(objW38F2041.slApprovalFlowIDW38F2041);
        String validationMessageTrainingFieldID = objShared.getValidationMessage(objW38F2041.slTrainingFieldIDW38F2041);
        String validationMessageTrainingCourseID = objShared.getValidationMessage(objW38F2041.slTrainingCourseIDW38F2041);
        String validationMessageProposalName = objShared.getValidationMessage(objW38F2041.txtProposalNameW38F2041);

        Boolean SaveW38F2041 = objShared.checkEnabled(objW38F2041.btnSaveW38F2041);
        Boolean NotSaveW38F2041 = objShared.checkEnabled(objW38F2041.btnNotSaveW38F2041);
        Boolean NextW38F2041 = objShared.checkEnabled(objW38F2041.btnNextW38F2041);

        Assert.assertEquals(validationMessageApprovalFlowID,objShared.STR_VALIDATE_SEL_EN);
        Assert.assertEquals(validationMessageTrainingFieldID,objShared.STR_VALIDATE_SEL_EN);
        Assert.assertEquals(validationMessageTrainingCourseID,objShared.STR_VALIDATE_SEL_EN);
        Assert.assertEquals(validationMessageProposalName,objShared.STR_VALIDATE_TEXTBOX_EN);

        Assert.assertEquals(SaveW38F2041,Boolean.TRUE);
        Assert.assertEquals(NotSaveW38F2041,Boolean.TRUE);
        Assert.assertEquals(NextW38F2041,Boolean.FALSE);
    }*/

    @Test(priority = 1)

    private void W38F2041_010() throws InterruptedException, IOException, SQLException {
        //W38F2040 W38F2040 = new W38F2040(driver);
        W38F2040 objW38F2040 = PageFactory.initElements(driver,W38F2040.class);
        W38F2041 objW38F2041 = new W38F2041(driver);
        DataBase objDb = new DataBase();
        ResultSet rs = objDb.get_data("EXEC W38P2005 'TSCO','DLQ0401', 'TrainingField','',''");
        while (rs.next()){
            System.out.println(rs.getString(2));
        }

        test = extent.startTest("W38F2041");
        clickMenuDaoTao();
        clickMenuKeHoachDaoTaoTongThe();

        Thread.sleep(3000);
        waitUntilToBeClickAble(objW38F2040.btnThemMoi);
        objW38F2040.clickThemMoi();
        verify_control(PATH_TESTDATA, "W38F2041.xlsx", "Required");
        Thread.sleep(3000);
        objW38F2041.close_form();
        W38F2000 xxx = PageFactory.initElements(driver,W38F2000.class);
    }

}

