package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Start023Slider {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/#colorpicker");
        WebElement element=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(element);
        WebElement slider=driver.findElement(By.xpath("//*[@id='green']/span"));
        Actions actions=new Actions(driver);
        actions.moveToElement(slider,100,126).build().perform();
        driver.quit();
    }
}
