package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Start030JSEScrollIntoView {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        WebElement clear=driver.findElement(By.id("clearbtn"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",clear);
        Thread.sleep(4000);
        driver.quit();
    }
}
