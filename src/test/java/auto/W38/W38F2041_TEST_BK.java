/*
package auto.W38;

import auto.utility.Excel;
import auto.utility.TShared;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.W38.W38F2040;
import pages.W38.W38F2041;
import pages.WP.Layout;
import pages.WP.Login;

import java.io.IOException;

import static java.util.concurrent.TimeUnit.SECONDS;


public class W38F2041_TEST_BK extends TShared{
    public WebDriver driver;
    public Login objLogin;
    public Layout objLayout;
    public W38F2040 objW38F2040;
    public W38F2041 objW38F2041;
    public TShared objShared;
    public Excel objExcel;

    //public String fileName = "W38F2041_demo.xlsx";
    public String fileName = "Validate.xlsx";
    public String sheetName = "Sheet1";

    //public String fileName = "W38F2041.xlsx";
    //public String sheetName = "W38F2041_010";

    public String getExcelCellString(Cell cell) {
        if (cell == null) {
            return null;
        }
        int type = cell.getCellType();
        switch (type) {
            case Cell.CELL_TYPE_STRING:
                return cell.getRichStringCellValue().getString();
            case Cell.CELL_TYPE_NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case Cell.CELL_TYPE_FORMULA:
                switch (cell.getCachedFormulaResultType()) {
                    case Cell.CELL_TYPE_STRING:
                        return cell.getRichStringCellValue().getString();
                    case Cell.CELL_TYPE_NUMERIC:
                        return String.valueOf(cell.getNumericCellValue());
                    default:
                        break;
                }
            default:
                break;
        }
        return null;
    }


    @BeforeTest()
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\PROJECT\\LEMONWEB\\geckodriver.exe");
        this.driver = new FirefoxDriver();
        this.driver.manage().timeouts().implicitlyWait(10, SECONDS);
        this.driver.get("http://apricot.diginet.com.vn:4000/lw4auto/login");
        driver.manage().window().maximize();
        objLogin = new Login(driver);
        objLogin.login_system("dlq0401", "123");

        objLayout = new Layout(driver);
        objLayout.clickMenuDaoTao();
        objLayout.clickMenuKeHoachDaoTaoTongThe();


        objW38F2040 = new W38F2040(driver);
        objW38F2041 = new W38F2041(driver);
        //objShared = new Shared(driver);
        objExcel = new Excel();

    }

    */
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
     }*//*



    */
/*@Test(priority=1)
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

        Assert.assertEquals(validationMessageApprovalFlowID,objShared.str_validate_sel);
        Assert.assertEquals(validationMessageTrainingFieldID,objShared.str_validate_sel);
        Assert.assertEquals(validationMessageTrainingCourseID,objShared.str_validate_sel);
        Assert.assertEquals(validationMessageProposalName,objShared.str_validate_textbox);

        Assert.assertEquals(SaveW38F2041,Boolean.TRUE);
        Assert.assertEquals(NotSaveW38F2041,Boolean.TRUE);
        Assert.assertEquals(NextW38F2041,Boolean.FALSE);
    }*//*

    @Test(priority=2)
    public void verify_control() throws IOException, InterruptedException {
        objW38F2040.clickThemMoi();
        Thread.sleep(5000);
        objShared.verify_control(PATH_TESTDATA,"W38F2041.xlsx","Required");
    }
*/
/*    @Test(priority=2)
    public void W38F2041_006() throws InterruptedException, IOException {
        String TC_ID = "W38F2041_006";
        String slTrainingFieldIDW38F2041 = "slTrainingFieldIDW38F2041";
        String slTrainingCourseIDW38F2041 = "slTrainingCourseIDW38F2041";

        //Sheet lwSheet = objExcel.get_data_sheet_excel(filePath, fileName, sheetName);
        int xxx = objExcel.getXXX();
        System.out.println(xxx);
        //objW38F2041.set_slTrainingFieldIDW38F2041("Kinh tế");
        //objW38F2041.set_slTrainingCourseIDW38F2041("Khóa đào tạo 2");
    }*//*


   */
/* @Test(priority = 45)
    private void W38F2041_009() throws InterruptedException, IOException, IOException {
        objW38F2041 = new W38F2041(driver);
        objW38F2040.clickThemMoi();
        Thread.sleep(1000);

        Integer rowCount = objExcel.get_num_row_excel(filePath, fileName, sheetName);
        Sheet lwSheet = objExcel.get_data_sheet_excel(filePath, fileName, sheetName);
        Integer ProNumber_num = Integer.parseInt(objExcel.get_num_cell(filePath, fileName, sheetName, 0));
        Integer ProCost_num = Integer.parseInt(objExcel.get_num_cell(filePath, fileName, sheetName, 1));
        Integer ProCompanyRate_num = Integer.parseInt(objExcel.get_num_cell(filePath, fileName, sheetName, 2));
        Integer ProCurrency_num = Integer.parseInt(objExcel.get_num_cell(filePath, fileName, sheetName, 4));
        Integer total_expected_num = Integer.parseInt(objExcel.get_num_cell(filePath, fileName, sheetName, 8));



        for (int i = 2; i <= rowCount; i++) {
            Row row = lwSheet.getRow(i);
            //BEGIN IMPORT DATA TEST
            String ProNumber = getExcelCellString(row.getCell(ProNumber_num));
            String ProCost = getExcelCellString(row.getCell(ProCost_num));
            String ProCompanyRate = getExcelCellString(row.getCell(ProCompanyRate_num));
            String ProCurrency = getExcelCellString(row.getCell(ProCurrency_num));
            String total_expected = getExcelCellString(row.getCell(total_expected_num));

            if (ProNumber != null) {
                objW38F2041.set_txtProNumberW38F2041(String.format("%.0f", Double.parseDouble(ProNumber)));
                Thread.sleep(1000);
                objW38F2041.set_txtProCostW38F2041(String.format("%.0f", Double.parseDouble(ProCost)));
                Thread.sleep(1000);
                objW38F2041.set_slProCurrencyIDW38F2041(ProCurrency);
                Thread.sleep(1000);
                objW38F2041.set_txtProCompanyRateW38F2041(String.format("%.0f", Double.parseDouble(ProCompanyRate)));
                String total_actual_temp = objW38F2041.get_txtProAverageCostsW38F2041().replaceAll(",","");
                Double total_actual_temp1 = Double.parseDouble(total_actual_temp);
                String total_actual = total_actual_temp1.toString();
                Assert.assertTrue(total_expected.contains(total_actual));
                System.out.print(total_expected+"---"+total_actual+"\n");
                Thread.sleep(3000);
                objW38F2041.clear_form();
            }
        }
    }*//*


    */
/*    @Test(enabled=false)
        private void W38F2041_010() throws InterruptedException {
            objW38F2040.clickThemMoi();
            Thread.sleep(1000);
            objW38F2041 = new W38F2041(driver);Thread.sleep(1000);
            objW38F2041.set_slApprovalFlowIDW38F2041("D38F2002");
            objW38F2041.set_txtProposalNameW38F2041("ABCD");
            objW38F2041.set_slTrainingFieldIDW38F2041("Kinh tế");
            objW38F2041.set_slTrainingCourseIDW38F2041("Khóa đào tạo 2");
            Thread.sleep(1000);
            objW38F2041.click_save();
            objW38F2041.click_saveNo();
            //objW38F2041.close_form();
        }*//*

    @AfterTest()
    public void exit() throws InterruptedException {
        //Thread.sleep(1000);
        //objShared.close_app();
    }
}

*/
