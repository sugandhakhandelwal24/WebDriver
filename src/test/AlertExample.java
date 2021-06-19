package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
		WebElement customerId = driver.findElement(By.xpath("//*[@name = 'cusid']"));
		customerId.sendKeys("2123");
		
		WebElement Submit = driver.findElement(By.xpath("//*[@name = 'submit']"));
		Submit.click();

		Alert alertObj = driver.switchTo().alert();
        alertObj.accept();
		
	}

}
