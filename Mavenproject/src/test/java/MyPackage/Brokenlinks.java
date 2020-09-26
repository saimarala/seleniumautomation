package MyPackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement>linkslist=driver.findElements(By.tagName("a"));
		linkslist.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println(linkslist.size());
		
		List <WebElement> activelinks=new ArrayList<WebElement>();
		for(int i=0;i<linkslist.size();i++) {
			if(linkslist.get(i).getAttribute("href")!=null){
				activelinks.add(linkslist.get(i));
				
			}
			
		}
		System.out.println(activelinks.size());
		for(int j=0;j<activelinks.size();j++) {
			HttpURLConnection connection=(HttpURLConnection) new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String response=connection.getResponseMessage();
			connection.disconnect();
			
			System.out.println(activelinks.get(j).getAttribute("href")+"-----"+response);
		

	}

}
}
