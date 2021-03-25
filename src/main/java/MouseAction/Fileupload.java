package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String URL = "http://demo.guru99.com/test/upload/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement filePicker = driver.findElement(By.name("uploadfile_0"));
        filePicker.sendKeys("C:\\Users\\v-brmuge\\Downloads\\cyber-3324202_1920.jpg"); // send keys to a file directly on hdd (only applies for <input> tags)

        driver.findElement(By.id("submitbutton")).click(); // submit the form


        Thread.sleep(2000); //wait 2 seconds...
        driver.quit(); // ... then close browser
    }
}
