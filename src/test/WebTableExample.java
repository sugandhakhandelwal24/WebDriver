package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id = 'customers'] /tbody/tr"));
		System.out.println("Total rows are :" +rows.size() );

		List<WebElement> columns = driver.findElements(By.xpath("//table[@id = 'customers'] /tbody/tr/th"));
		
		System.out.println("Total columns are :" + columns.size());
		
		//to get the data
		
		WebElement data = driver.findElement(By.xpath("//table[@id = 'customers'] /tbody/tr[4]/td[1]"));
		System.out.println("Data is : " + data.getText());
		
		WebElement scrollElement = driver.findElement(By.xpath("//h2[text()='HTML Table - Collapsed Borders']"));
        JavascriptExecutor obj = (JavascriptExecutor) driver;
        obj.executeScript("arguments[0].scrollIntoView();", scrollElement);
        scrollElement.click();
		
		driver.close();
	}

}
