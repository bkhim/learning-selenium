package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/buttons"; // target URL

		driver.get(URL); // open the login page

		driver.manage().window().maximize(); // maximize the login window
		
		Actions action = new Actions(driver);	
		
		//right clicking
		WebElement dblClickBtn = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(dblClickBtn).perform(); // right click function
		
		WebElement message = driver.findElement(By.id("rightClickMessage"));
		
		if(message.getText().equals("You have done a right click")) {
			System.out.println("Successful");
		} else {
			System.out.println("Failed");
		}
		
		Thread.sleep(1500);
		
		driver.quit();

	}
}
