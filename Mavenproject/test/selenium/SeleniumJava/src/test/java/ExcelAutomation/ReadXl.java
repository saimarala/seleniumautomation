//
//package ExcelAutomation;
//
//import java.io.FileInputStream;
//import java.util.Properties;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public final class ReadXl {
//		static XSSFWorkbook wb;
//		static XSSFSheet sh;
//	public static void main(String[] args)throws Throwable {
//		//property file
//		Properties prop=new Properties();
//
//		FileInputStream ip=new FileInputStream("C:\\selenium\\SELENIUM_SCRIPT\\MyProject\\src\\properties\\Config.properties");
//		prop.load(ip);
//		System.out.println(prop.get("xlpath"));
//		System.out.println(prop.getProperty("xlpath"));
//		String x=prop.getProperty("xlpath");
//
//		//excel
//
//		FileInputStream fis=new FileInputStream(x);
//		wb=new XSSFWorkbook(fis);
//		sh=wb.getSheet("Login");
////		System.out.println("sh1:"+sh);
////		sh=wb.getSheetAt(0);
////		System.out.println("sh2:"+sh);
//		int rowCount=sh.getLastRowNum();
//		int colCount=sh.getRow(1).getLastCellNum();
//		System.out.println(rowCount+":"+colCount);
//		Row r=sh.getRow(0);
//		//int l=r.getPhysicalNumberOfCells();
//
//		Cell cell=sh.getRow(1).getCell(2);
//		System.out.println("cell 1:"+cell);
//		System.out.println("cell 2:"+cell.toString());
//		for(int i=0;i<rowCount;i++) {
//			Row row=sh.getRow(i);
//			for(int j=0;j<colCount;j++) {
//
//				Cell col=row.getCell(j);
//
////				String data=sh.getRow(i).getCell(j).getStringCellValue();
////				System.out.println("data from row :"+data);
//				//System.out.print(col+"||");
//				System.out.print(col.toString()+"||");
//
//			}
//			System.out.println();
//		}
//
//		wb.close();
//
//		//wb=WorkbookFactory.create("C:\\selenium\\DataSheet1.xlsx");
//
//	}
//
//}
