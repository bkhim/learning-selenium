package MouseAction;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VicJumia {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String URL = "https://www.jumia.co.ke/mobile-phones/";
        Actions actions = new Actions(driver);
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.id("fi-q")); // get the search field
        searchBox.sendKeys("HTC M1" + Keys.ENTER);   // input value and click enter


        WebElement inp1 = driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[2]/div[2]/div/section/div[2]/div[1]/input"));
        actions.keyDown(inp1, Keys.CONTROL).sendKeys("a").sendKeys("x").perform(); // click in the search box and select everything

        Thread.sleep(1200);
    }
}