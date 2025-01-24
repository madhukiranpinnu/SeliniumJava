package TestNGDemo.InvocationDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test8 {
    @Test(invocationCount = 3, invocationTimeOut = 100000, threadPoolSize = 3)
    public void Test1() throws InterruptedException {
        System.out.println("Test 1");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://google.com");
        Thread.sleep(5000);
        driver.quit();
    }
}
