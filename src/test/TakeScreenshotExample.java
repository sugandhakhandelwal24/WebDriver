package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
		TakesScreenshot TSObj = (TakesScreenshot)driver;
		File myFile = TSObj.getScreenshotAs(OutputType.FILE);
	try {	FileUtils.copyFile(myFile,  new File("test.png"));
	}
	catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
     }
		driver.close();

	}

}
