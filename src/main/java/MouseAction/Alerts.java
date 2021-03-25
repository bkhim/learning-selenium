package MouseAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        String URL = "http://demo.guru99.com/test/delete_customer.php";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement inputField = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")); // get user field
        inputField.sendKeys("userone"); // send some text

        driver.findElement(By.name("submit")).click(); // click the submit button

        Alert alert = driver.switchTo().alert(); // switch driver to alert
        System.out.println(alert.getText()); // get content of alert box

        alert.accept(); // accept delete user
        alert.accept(); // confirm delete success

    }
}
