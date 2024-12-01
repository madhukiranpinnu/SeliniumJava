package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Start016DropdownMultiple {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement element=driver.findElement(By.id("ide"));
        Select select=new Select(element);
        select.selectByIndex(0);
        select.selectByValue("ij");
        select.selectByVisibleText("NetBeans");
        List<WebElement> list=select.getAllSelectedOptions();
        for (WebElement ele: list){
            System.out.println(ele.getText());
        }
        select.deselectByValue("ij");
        select.deselectByIndex(0);
        select.deselectByVisibleText("NetBeans");
        driver.quit();
    }
}
