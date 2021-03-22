import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOne {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String URL = "http://thedemosite.co.uk/"; // target URL

		driver.get(URL); // open the login page

		driver.manage().window().maximize(); // maximize the login window 

		String loginLinkText = "4. Login"; // get the text from the login link since it doesn't have a class/id...
		String regLinkText = "3. Add a User"; 
		
		// click the register link
		driver.findElement(By.linkText(regLinkText)).click();
		Thread.sleep(1500);
		
		// enter some user details
		driver.findElement(By.name("username")).sendKeys("testdemo"); // send some text to input field
		driver.findElement(By.name("password")).sendKeys("testdemo"); // send some text to input field
		Thread.sleep(1500);
		
		// find the submit button and click it		
		driver.findElement(By.name("FormsButton2")).click(); 
		Thread.sleep(1500);

		// now login the user
		driver.findElement(By.linkText(loginLinkText)).click(); // find the login link and click it
		Thread.sleep(1500);
		
		driver.findElement(By.name("username")).sendKeys("testdemo"); // send some text to input field
		driver.findElement(By.name("password")).sendKeys("testdemo"); // send some text to input field
		Thread.sleep(1500);
		
		// click the login button
		driver.findElement(By.name("FormsButton2")).click(); // find the login button and click it
		Thread.sleep(1500);
		
		WebElement message = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		
		if(message.getText().equals("**Successful Login**")) {
			System.out.println("Successful login");
		} else {
			System.out.println("Failed Login");
		}

		// close the browser and terminate driver object
		driver.quit();
			

	}
}
