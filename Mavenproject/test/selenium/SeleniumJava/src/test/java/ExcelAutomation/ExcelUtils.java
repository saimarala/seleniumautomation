package ExcelAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    static XSSFWorkbook wb;
    static XSSFSheet sh;

    public ExcelUtils(String excelPath, String SheetName) {


        try {
            FileInputStream fis = new FileInputStream(excelPath);
            wb = new XSSFWorkbook(fis);

            sh = wb.getSheet(SheetName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int rowCount(String SheetName) {
        sh = wb.getSheet(SheetName);
        return sh.getPhysicalNumberOfRows();
    }

    int colCount(String SheetName) {
        sh = wb.getSheet(SheetName);
        int colCount = sh.getRow(0).getPhysicalNumberOfCells();
        return colCount;
    }

    static String getCellData(String SheetName, int rowNum, int colNum) {
        sh = wb.getSheet(SheetName);
        String cellData = sh.getRow(rowNum).getCell(colNum).getStringCellValue();
        return cellData;
    }

//	static String getNumericCellData() {
//		String cellData=sh.getRow(0).getCell(0).getStringCellValue();
//		return cellData;
//	}

}
