package APIAutomation;

import ExcelAutomation.XLUtility;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest_AddNewEmployee {

    @Test(dataProvider = "empProvider1")
    void postNewEmployees(String eName,String eSal,String eAge){
        String current=System.getProperty("user.dir");
        RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
        RequestSpecification httpRequest=RestAssured.given();

        JSONObject js=new JSONObject();
        js.put("name",eName);
        js.put("salary",eSal);
        js.put("age",eAge);
        httpRequest.header("Content-Type","application/json");
        httpRequest.body(js.toJSONString());

        Response response=httpRequest.request(Method.POST,"/create");
        String responseBody=response.body().asString();
        System.out.println("response body is :"+responseBody);
        Assert.assertTrue(responseBody.contains(eName));
        Assert.assertTrue(responseBody.contains(eSal));
        Assert.assertTrue(responseBody.contains(eAge));

        Assert.assertEquals(response.getStatusCode(),200);

    }

    @DataProvider(name = "empProvider")
    Object [][] getEmpData(){
        String empData[][]={{"selenium1","123","20"},{"selenium2","124","35"},{"selenium3","125","40"}};
        return empData;
    }
    @DataProvider(name = "empProvider1")
    Object[][] getEmpData1() throws Exception {
        String path="C:\\Users\\marala\\git3\\seleniumautomation\\seleniumautomation-master\\Mavenproject\\test\\selenium\\SeleniumJava\\src\\test\\resources\\DataFiles\\empData.xlsx";
        XLUtility xl=new XLUtility(path);
        int rowCount=xl.getRowCount("Sheet1");
        int colCount= xl.getCellCount("Sheet1",0);
        Object empData[][]=new Object[rowCount][colCount];
        for (int i=1;i<rowCount;i++){
            for (int j=0;j<colCount;j++){
                empData[i-1][j]=xl.getCellData("Sheet1",i,j);
            }
        }
        return empData;
    }

}
