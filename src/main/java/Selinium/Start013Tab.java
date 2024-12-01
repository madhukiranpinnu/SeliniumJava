package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Set;

public class Start013Tab {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parent=driver.getWindowHandle();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.id("newTabBtn")));
        Set<String> set=driver.getWindowHandles();
        for(String w:set){
            if(!w.equals(parent)){
                driver.switchTo().window(w);
            }
        }
        System.out.println(driver.findElement(By.xpath("//h1[normalize-space(.)='AlertsDemo']")).isDisplayed());
        driver.quit();
    }
}
