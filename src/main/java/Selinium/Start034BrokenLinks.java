package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Start034BrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/broken");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        for (WebElement link:links){
            String href=link.getAttribute("href");
            if (href!=null){
                URL url=new URL(href);
                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.connect();
                int responseCode=httpURLConnection.getResponseCode();
                if(responseCode>=400){
                    System.out.println("Brokenlink: "+responseCode+" and "+ "URL: "+url);
                }
                else {
                    System.out.println("GoodLink: "+responseCode+" and "+ "URL: "+url);
                }
            }
        }
        driver.quit();
    }
}
