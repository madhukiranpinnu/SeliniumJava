package Selinium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Start033ScreenshotElement {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        WebElement element=driver.findElement(By.id("btn1"));
        File file=element.getScreenshotAs(OutputType.FILE);
        File hre=new File("D:\\Goal\\frame\\SeeMe\\src\\main\\resources\\Screenshot\\element.png");
        FileUtils.copyFile(file,hre);
        driver.quit();
    }
}
