package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
		WebElement FileInput = driver.findElement(By.xpath("//*[@name = 'uploadfile_0']"));
		FileInput.sendKeys("\\home\\sugandhakhandel\\Downloads\\Notes.text");
		
		WebElement TnC = driver.findElement(By.xpath("//*[@name = 'terms']"));
		TnC.click();
		
		WebElement Submit = driver.findElement(By.xpath("//*[@name = 'send']"));
		
		Submit.click();
		
		
		
	}

}
