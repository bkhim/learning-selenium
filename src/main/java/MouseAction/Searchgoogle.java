package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Searchgoogle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String ULR = "https://google.com";
        driver.get(ULR);
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebElement s = driver.findElement(By.name("q"));
        s.sendKeys("Blancos Khim" + Keys.ENTER);

        // search over another result
        WebElement s2 = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input"));
        action.keyDown(s2, Keys.CONTROL).sendKeys("a").perform(); // click in the search box and select everything
        action.keyDown(s2, Keys.DELETE).perform(); // click in the search box and select everything // todo
    }
}
