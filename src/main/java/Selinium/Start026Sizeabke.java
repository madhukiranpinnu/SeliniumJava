package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Start026Sizeabke {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@class=\"demo-frame\"]")));
        WebElement element=driver.findElement(By.xpath("//*[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(element,296,215).perform();

    }
}
