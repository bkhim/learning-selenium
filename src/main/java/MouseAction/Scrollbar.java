package MouseAction;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String ULR = "https://stackoverflow.com/";
        driver.get(ULR);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)"); // scroll down
        Thread.sleep(2000);

        WebElement dest = driver.findElement(By.xpath("//*[@id=\"content\"]/section[3]/div[2]/div[3]/div/div[1]"));
        js.executeScript("arguments[0].scrollIntoView()", dest); // scroll up
        Thread.sleep(2000);

        // scroll to end
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

        driver.quit();
    }
}
