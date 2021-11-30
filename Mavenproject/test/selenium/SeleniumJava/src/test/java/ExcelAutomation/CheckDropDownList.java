package ExcelAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckDropDownList {

    @Test(enabled = false)
    void test() throws Exception{
        String current=System.getProperty("user.dir");
        //String path=current+".\\DataFiles\\test.xlsx";
        String path=current+"\\src\\test\\resources\\DataFiles\\DropDown.xlsx";
        FileInputStream fi=new FileInputStream(path);
        XSSFWorkbook wb=new XSSFWorkbook(fi);
        XSSFSheet sh=wb.getSheet("Sheet1");
        int rows=sh.getLastRowNum();
        int cols=sh.getRow(0).getLastCellNum();
        for (int i=1;i<rows;i++){
            for (int j=0;j<cols;j++){
                //String data=sh.getRow(i).getCell(j).getStringCellValue();
               // XSSFCell cell=sh.getRow(i).getCell(j);
                String data=sh.getRow(i).getCell(j).toString();
                if(data.equals("June")){
                    int c=sh.getRow(i).getCell(j).getColumnIndex();
                    int r=sh.getRow(i).getCell(j).getRowIndex();
                    System.out.println(c+":"+r+data);
                    break;
                }

            }
        }
        wb.close();
        fi.close();
    }

    @Test(enabled = false)
    void testDD() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        boolean result=checkDDListFromUIAndExcel(driver,"Month");
                if(result){
                    System.out.println("Test Passed");
                }else {
                    System.out.println("Test Failed");
                }

    }

    boolean checkDDListFromUIAndExcel(WebDriver driver,String value)throws Exception{
        int cellNum=0;
        boolean result=false;
        List<String>expectedList=new ArrayList<>();
        String current=System.getProperty("user.dir");
        String path=current+"\\src\\test\\resources\\DataFiles\\DropDown.xlsx";
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        XSSFSheet sh=wb.getSheet("Sheet1");
        int col=sh.getRow(0).getLastCellNum();
        int row=sh.getLastRowNum();
        for (int i=0;i<col;i++){
            String colHeader=sh.getRow(0).getCell(i).toString();
            if(colHeader.equals(value)){
                cellNum=i;
                break;
            }
        }

        for (int j=0;j<row;j++){
            XSSFCell cell=sh.getRow(j).getCell(cellNum);
            if(cell==null || cell.getCellType()== CellType.BLANK){
                break;
            }
           String cellData=sh.getRow(j).getCell(cellNum).toString();
           expectedList.add(cellData);
        }
        System.out.println(expectedList);

        wb.close();
        fis.close();


//        s.selectByVisibleText("June");
        List<String> actualList=new ArrayList<>();
        Select s=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        List<WebElement>ls=s.getOptions();
        for (WebElement ele :ls){
            actualList.add(ele.getAttribute("value"));
        }
        //ls.stream().map(e->actualList.add(e.getAttribute("value")));
        List<String>ls1=  ls.stream().map(e->e.getAttribute("value")).collect(Collectors.toList());
        System.out.println(ls1);
        int c=0;
        if (expectedList.size()==actualList.size()){
            for (int i=0;i<expectedList.size();i++){
                if (expectedList.get(i).equals(ls1.get(i))){
                    continue;
                }else {
                    System.out.println("Mismatch between the options==>"+"\n"
                    +"Expected==>"+expectedList.get(i)+"\n"+"Actual==>"+ls1.get(i));
                    c++;
                }
            }
            if(c==0){
                System.out.println("Optiona are matching");
                result=true;
            }else {
                System.out.println("Mismatch Optionss");
                result=false;
            }
        }
        return result;
    }

    void m1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        Select s=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
//        s.selectByVisibleText("June");
        List<String> actualList=new ArrayList<>();
        List<WebElement>ls=s.getOptions();
        for (WebElement ele :ls){
            actualList.add(ele.getAttribute("value"));
        }
        //ls.stream().map(e->actualList.add(e.getAttribute("value")));
        List<String>ls1=  ls.stream().map(e->e.getAttribute("value")).collect(Collectors.toList());
        System.out.println(ls1);


//        List<WebElement>ls=driver.findElements(By.xpath("//select[@placeholder='Month']//option[text()!=' ']"));
//        for (WebElement ele:ls){
//            String val=ele.getText();
//            String val1=ele.getAttribute("value");
//            if(ele.getAttribute("value").equals("June")){
//                ele.click();
//            }
//        }
        driver.quit();
    }

    @Test
    void getPop() throws Exception{
        String current=System.getProperty("user.dir");
        String path=current+"\\src\\test\\resources\\DataFiles\\Countries.xlsx";
        int colHeader=0;
        int rowNum=0;
        int rowHeader=0;
        try {
            FileInputStream fis=new FileInputStream(path);
            XSSFWorkbook wb=new XSSFWorkbook(fis);
            XSSFSheet sh= wb.getSheet("Sheet1");
            int row=sh.getLastRowNum();
            int col=sh.getRow(0).getLastCellNum();
            for(int i=0;i<col;i++){
                String cheader=sh.getRow(0).getCell(i).toString();
                if(cheader.equals("Population")){
                    colHeader=i;
                }else if(cheader.equals("Countries")) {
                    rowHeader=i;
                }
            }
            for (int j=1;j<row;j++){
                String cName=sh.getRow(j).getCell(rowHeader).toString();
                if(cName.equals("India")){
                    rowNum=j;
                    break;
                }
            }
            String data=sh.getRow(rowNum).getCell(colHeader).toString();
            System.out.println(data);
        }catch (Exception e){


        }
    }
}
