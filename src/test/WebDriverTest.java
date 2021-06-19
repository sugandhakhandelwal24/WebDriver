package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		
	//	WebElement ResourceLink = driver.findElement(By.linkText("Resources"));
		//ResourceLink.click();
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
	WebElement username = driver.findElement( By.name("user_login"));
		
	/*	WebDriverWait wait = new WebDriverWait(driver,30);
	        
	        wait.until(ExpectedConditions.elementToBeClickable(username));*/
		
		username.sendKeys("sugandha.khandelwal19@gmail.com");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Anshul@123342");
		
		WebElement rememberMe = driver.findElement(By.className("rememberMe"));
		rememberMe.click();
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		String ActMsg = Error.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
		String ClassName = Error.getAttribute("Class");
		String TagName = Error.getTagName();
		System.out.println("Class Name is : " + ClassName);
		System.out.println("Tag Name is : " + TagName);

		if(ActMsg.equals(ExpMsg))
		{
			System.out.println("Test case Passed");
			
		}
		else
		{
			System.out.println("Test case Failed");
			
		}		
		
		List<WebElement> ListOfInput = driver.findElements(By.tagName("input"));
		System.out.println("Total input tags : " +ListOfInput.size() );
		
		List<WebElement> ListofLinks = driver.findElements(By.tagName("a"));
		int ListCount = ListofLinks.size();
		System.out.println("Total links available on the page: " + ListCount);
		
		for(int index = 0;index<ListCount;index++ )
		{

			System.out.println("Hyperlinks Text : " + ListofLinks.get(index).getText());
		}
		
		driver.close();
	//	WebElement profileLink = driver.findElement(By.className("profile-img"));
	//	profileLink.click();
		
	//	WebElement LogoutButton = driver.findElement(By.linkText("Logout"));
	//	LogoutButton.click();
		
		
	
	}

}

