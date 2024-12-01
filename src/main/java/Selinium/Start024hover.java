package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Start024hover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.ebay.com/");
        WebElement electronics=driver.findElement(By.xpath("//li[@class=\"vl-flyout-nav__js-tab\"]/a[.='Electronics' and @_sp]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(electronics).perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
