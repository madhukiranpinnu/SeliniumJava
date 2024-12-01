package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Start012Windows {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String window=driver.getWindowHandle();
        System.out.println(window);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.id("newWindowBtn")));
        Set<String> lis= driver.getWindowHandles();
        for(String windo:lis){
           if(!windo.equalsIgnoreCase(window)) {
               driver.switchTo().window(windo);
           }
        }
        System.out.println(driver.findElement(By.xpath("//h1[normalize-space(.)='Basic Controls']")).isDisplayed());
        driver.quit();
    }
}
