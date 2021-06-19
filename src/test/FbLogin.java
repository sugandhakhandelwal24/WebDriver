package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		userName.sendKeys("sugandha.khandelwal19@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id = 'pass']"));
		password.sendKeys("Password123");
		
		//WebElement text = driver.findElement(By.xpath("//h2[text()= 'Connect with friends and the world around you on Facebook.']"));
		
	//	WebElement text = driver.findElement(By.xpath("//*[text()= 'Connect with friends and the world around you on Facebook.']"));
	
	//	WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Connect with friends')]");
		
		//WebElement LoginButton = driver.findElement(By.xpath("//button[@type= 'submit']"));
	//	LoginButton.click();
	
		//WebElement CreateAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		//WebElement CreateAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		//WebElement CreateAccount = driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));
		
		//CreateAccount.click();
		
	//	WebElement forgotPassword = driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
	//	forgotPassword.click();
		
		//*[starts-with(text(),'Connect with')]
		//input[@name = 'email' and @id = 'email']
		//*[starts-with(text(),'Connect with') or  (contains(text(), 'Connect with'))]
		//input[@name='email'] //following::input[1]
		//input[@name='pass']//preceding::input[1]
		
		//input[@name='jazoest']/following-sibling::input
		
		driver.close();
		
		
	}

}
