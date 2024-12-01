package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Start014MultiWindow {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String window=driver.getWindowHandle();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.xpath("newWindowsBtn")));
        Set<String> str=driver.getWindowHandles();
        Iterator<String> itr= str.iterator();
        while(itr.hasNext()){
            if(!itr.next().equalsIgnoreCase(window)){
                driver.switchTo().window(itr.next());
            }
        }
        System.out.println(driver.findElement(By.xpath("//h1[normalize-space(.)='AlertsDemo']")).isDisplayed());
        driver.quit();
    }
}
