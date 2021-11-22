package ExcelAutomation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriveTest {


    @Test
    void test(){

    }

    @DataProvider(name="login")
    public Object[] getData() throws Exception {
        String path="";
        XLUtility xl=new XLUtility(path);
        int rows= xl.getRowCount("Sheet1");
        int cols= xl.getCellCount("Sheet1",1);
       String loginData[][]=new String[rows][cols];
       for (int i=1;i<rows;i++){
           for (int j=0;j<cols;j++){
               loginData[i-1][j]=xl.getCellData("Sheet1",i,j);
           }
       }

       return loginData;
    }
}
