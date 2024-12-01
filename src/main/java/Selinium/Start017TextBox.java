package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Start017TextBox {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.findElement(By.id("firstName")).sendKeys("Madhukiran");
        driver.findElement(By.id("lastName")).sendKeys("Pinnu");
        driver.findElement(By.id("email")).sendKeys("gsvjskbv@hj.com");
        driver.findElement(By.id("password")).sendKeys("Mk@123");
        driver.quit();
    }
}
