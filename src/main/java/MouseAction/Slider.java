package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String ULR = "https://demoqa.com/slider";
        driver.get(ULR);
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebElement slider = driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
        action.clickAndHold(slider).moveByOffset(5, 0).perform();


        Thread.sleep(1500);
        driver.quit();
    }
}
