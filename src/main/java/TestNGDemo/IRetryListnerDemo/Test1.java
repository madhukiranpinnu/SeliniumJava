package TestNGDemo.IRetryListnerDemo;

import org.testng.annotations.Test;
public class Test1 {
    @Test(retryAnalyzer = IRetryListner.class)
    public void Test(){
        System.out.println(5/0);
    }
}
