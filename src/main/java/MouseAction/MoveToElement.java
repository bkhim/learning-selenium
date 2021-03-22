package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "https://demoqa.com/menu"; // target URL

		driver.get(URL); // open the login page

		driver.manage().window().maximize(); // maximize the login window

		Actions action = new Actions(driver);

		WebElement mainMenu = driver.findElement(By.linkText("Main Item 2"));
		action.moveToElement(mainMenu).perform(); // hover
		Thread.sleep(1500);

		// get the subMenu
		WebElement subMenu = driver.findElement(By.partialLinkText("SUB SUB"));
		action.moveToElement(subMenu).perform(); //hover



		Thread.sleep(1500);

		driver.quit();

	}
}
