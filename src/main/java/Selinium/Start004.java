package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Start004 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        driver.findElement(By.id("btn1")).click();
        FluentWait fluentWait=new FluentWait<>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(6));
        fluentWait.pollingEvery(Duration.ofSeconds(1));
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
        driver.findElement(By.id("txt1")).sendKeys("lol");
        Thread.sleep(5000);
        driver.quit();
    }
}
