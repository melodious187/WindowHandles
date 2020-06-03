import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {

    public static void main(String[] args) throws InterruptedException {
        // launch new chrome browser
        System.setProperty("webdriver.chrome.driver", "C:/dev/tools/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // Launch Chrome browser

        // Launch application
        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.get(url);

        // Print dimensions for current window
        Dimension d = driver.manage().window().getSize();
        System.out.println("The dimension of the window is: " + d );

        // Resize current window to a specific size
        Dimension d1 = new Dimension(300,200);
        driver.manage().window().setSize(d1);
        Thread.sleep(3000);

        // Set window position of window
        Point p = new Point(400,500);
        driver.manage().window().setPosition(p);
        Thread.sleep(3000);

        // Maximize the browser
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // close browser
        driver.quit();

    }

}
