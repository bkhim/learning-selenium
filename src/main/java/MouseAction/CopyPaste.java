package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String ULR = "https://extendsclass.com/text-compare.html";
        driver.get(ULR);
        driver.manage().window().maximize();

        Actions action = new Actions(driver);

        WebElement s = driver.findElement(By.name("q"));
        s.sendKeys("Blancos Khim" + Keys.ENTER);

        // search over another result
        WebElement field1 = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div"));
        WebElement field2 = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]"));

        action.keyDown(field1, Keys.CONTROL).sendKeys("a").sendKeys("c").perform(); // click in the search box and select everything
        action.keyDown(field2, Keys.CONTROL).sendKeys("a").sendKeys("v").perform(); // click in the search box and select everything

        Thread.sleep(1200);
        driver.quit();
    }
}
