package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Start028JSEInputText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName=driver.findElement(By.id("firstName"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].value='madhukiran';",firstName);
        Thread.sleep(3000);
        driver.quit();
    }
}
