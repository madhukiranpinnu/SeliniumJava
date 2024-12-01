package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start011FrameMulti1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.switchTo().frame("frm3");
        driver.switchTo().frame("frm1");
        System.out.println(driver.findElement(By.xpath("//h1[normalize-space(.)='HTML Dropdowns']")).isDisplayed());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("//h1[normalize-space(.)='Frames Practice']")).isDisplayed());
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//h1[normalize-space(.)='Frames Practice']")).isDisplayed());
        driver.quit();
    }
}
