package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start010Frame {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.switchTo().frame("frm1");
        System.out.println(driver.findElement(By.xpath("//h1[normalize-space(.)='HTML Dropdowns']")).isDisplayed());
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//*[.='Frame1:']")).isDisplayed());
        driver.quit();
    }
}
