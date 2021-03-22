package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DblClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/buttons"; // target URL

		driver.get(URL); // open the login page

		driver.manage().window().maximize(); // maximize the login window
		
		Actions action = new Actions(driver);	
		
		WebElement dblClickBtn = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(dblClickBtn).perform(); // double clisk
		
		WebElement message = driver.findElement(By.id("doubleClickMessage"));
		
		if(message.getText().equals("You have done a double click")) {
			System.out.println("Successful");
		} else {
			System.out.println("Failed");
		}
		
		Thread.sleep(1500);
		
		driver.quit();

	}
}
