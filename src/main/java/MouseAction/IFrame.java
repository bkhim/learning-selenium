package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String URL = "http://demo.guru99.com/test/guru99home/";
        driver.get(URL);
        driver.manage().window().maximize();

        driver.switchTo().frame("a077aa5e"); // we need to switch to the frame to find elements in it
        WebElement iframeImg = driver.findElement(By.xpath("/html/body/a/img")); // find the img in the iframe
        iframeImg.click(); // click the image

        driver.switchTo().defaultContent(); // switch back to main window

        Thread.sleep(2000); //wait 2 seconds...
        driver.quit(); // ... then close browser

    }
}
