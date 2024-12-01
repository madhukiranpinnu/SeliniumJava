package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Start015DropdownSingle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement dropdown=driver.findElement(By.id("course"));
        Select select=new Select(dropdown);
        select.selectByValue("net");
        select.selectByIndex(1);
        select.selectByVisibleText("Javascript");
        List<WebElement> lissy=select.getAllSelectedOptions();
        for(WebElement ele:lissy){
            System.out.println(ele.getText());
        }
        driver.quit();
    }
}
