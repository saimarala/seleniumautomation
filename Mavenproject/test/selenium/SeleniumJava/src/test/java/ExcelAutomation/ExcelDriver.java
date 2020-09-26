package ExcelAutomation;

public class ExcelDriver {

    public static void main(String[] args) {
        String excelPath = "C:\\selenium\\DataSheet.xlsx";
        String SheetName = "Login";
        ExcelUtils obj = new ExcelUtils(excelPath, SheetName);

        System.out.println(ExcelUtils.rowCount(SheetName));
        System.out.println(obj.colCount(SheetName));

        System.out.println(ExcelUtils.getCellData(SheetName, 1, 0));
    }

}
