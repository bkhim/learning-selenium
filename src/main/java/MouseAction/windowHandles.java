package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String URL = "https://demoqa.com/browser-windows";
        driver.get(URL);
        driver.manage().window().maximize();

        /*
          getWindowsHandles -> is the parent window
          getWindowHandles  -> includes child handles
         */

        String parentWindow = driver.getWindowHandle(); // get the current window

        driver.findElement(By.id("windowButton")).click(); // open new window

        Set<String> sVar = driver.getWindowHandles(); // get all the windows
        Iterator<String> ivar = sVar.iterator(); // looping

        while(ivar.hasNext()) { // if the array has a new windows, for each do this...
            String childWindow = ivar.next(); // save it to a next variable called childWindow
            driver.switchTo().window(childWindow); // move to the child window to operate on it
            if (!parentWindow.equals(childWindow )){ // if it\s a new windows
                System.out.println(driver.findElement(By.id("sampleHeading")).getText()); // a tag in the child window
                Thread.sleep(2000); //wait 2 seconds...
            }
        }

        driver.switchTo().window(parentWindow); // go back to the parent window
        System.out.println(driver.getTitle());  // print the title of the parent


        Thread.sleep(2000); //wait 2 seconds...
        driver.quit();            // ... then close browser
    }
}
