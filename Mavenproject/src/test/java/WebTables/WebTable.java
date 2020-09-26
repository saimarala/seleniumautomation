package WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/List_of_current_Indian_chief_ministers");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		Thread.sleep(4000);
		//columns
		
		int colHeader=0;
		int rowHeader=0;
		String CBeforeXpath="//table[@class='wikitable sortable jquery-tablesorter']//th[";
		String CAfterXpath="]";
		//int ColCount=0;
		List<WebElement> col=driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//th"));
		System.out.println("colSize :"+col.size());
		for(int j=1;j<=col.size();j++) {
			String CActualXpath=CBeforeXpath+j+CAfterXpath;
			WebElement elemenHeader=driver.findElement(By.xpath(CActualXpath));
			if(elemenHeader.getText().equalsIgnoreCase("name[3]")) {
				colHeader=j;
				
			}
			else if(elemenHeader.getText().contains("(past chief ministers)")) {
				rowHeader=j;
				
			}
				
			
		}
		
		
		//rows
		List<WebElement> row=driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tbody//tr//td["+rowHeader+"]"));
		String BeforeXpath="//table[@class='wikitable sortable jquery-tablesorter']//tbody//tr[";
		String AfterXpath="]//td["+rowHeader+"]";
		System.out.println("rowSize :"+row.size());
		int rowNum=0;
		for(int i=1;i<=row.size();i++) {
			String ActualXpath=BeforeXpath+i+AfterXpath;
			WebElement element=driver.findElement(By.xpath(ActualXpath));
			if(element.getText().contains("Assam")) {
				 rowNum=i;
				break;
				
			}
		}
	
		WebElement e=driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//tbody//tr["+rowNum+"]//td["+colHeader+"]"));
		System.out.println(e.getText());
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
