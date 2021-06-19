package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
		WebElement Drag = driver.findElement(By.xpath("//li[@id='credit2']/a"));        
        WebElement Drop = driver.findElement(By.xpath("//*[@id='bank']/li"));
        
        Actions actionObj = new Actions(driver);
        actionObj.dragAndDrop(Drag, Drop).build().perform();
	}

}
