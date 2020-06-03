import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

    public static void main(String[] args)  throws InterruptedException {
        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // open website
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        // Click button which generates alert box
        driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']")).click();
        Thread.sleep(1000);

        // click ok
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        // Click button which generates alert box
        driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']")).click();
        Thread.sleep(1000);

        // click cancel
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);

        driver.quit();


    }

}
