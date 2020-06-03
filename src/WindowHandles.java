import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Stream;

public class WindowHandles {

    public static void main(String[] args) {
        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // open web site
        String baseUrl = "http://amayo.blogspot.com";
        driver.navigate().to(baseUrl);

        // switch to Google news link on page
        driver.findElement(By.linkText("Google News")).click();
        // get the url for this page
        String gNews = driver.getCurrentUrl();
        //open page
        // driver.get(gNews);

        // switch back to home page
        driver.navigate().to(baseUrl);

        // open a new tab in the browser
        ((JavascriptExecutor) driver).executeScript("window.open()");

        // get handles on both tabs
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        // switch to new tab
        driver.switchTo().window(tabs.get(1));
        //open google news in new tab
        driver.get(gNews);


        // print all window handles
        System.out.println("The handle for the amayo blogspot Home page is: " + (tabs.get(0)));
        System.out.println("The handle for the Google News page is:         " + (tabs.get(1)));

        // close browser
        driver.quit();


    }

}
