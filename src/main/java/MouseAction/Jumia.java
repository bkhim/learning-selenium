package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class Jumia {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);

        String ULR = "https://jumia.co.ke/mobile-phones";
        String start = "5000";
        String end   = "15000";
        driver.get(ULR);
        driver.manage().window().maximize();


        WebElement searchBox = driver.findElement(By.id("fi-q")); // get the search field
        searchBox.sendKeys("v v" + Keys.ENTER);   // input value and click enter

        WebElement startPrice = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/section/div[2]/div[1]/input")); // start price
        WebElement endPrice   = driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div[2]/div/section/div[2]/div[2]/input")); // end price

        // clearing the default values
        //action.keyDown(startPrice, Keys.CONTROL).sendKeys("a").sendKeys("x"); // click in the start price box and delete content
        action.keyDown(startPrice, Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL).sendKeys(start).perform(); // click in the search box and select everything
        action.keyDown(endPrice, Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).sendKeys(end).perform(); // click in the end price box and delete content

        // click the apply button
        WebElement applyBtn = driver.findElement(By.xpath("//*[@id=\"jm\"]/main/div[2]/div[2]/div/section/header/button"));
        applyBtn.click();
    }
}
