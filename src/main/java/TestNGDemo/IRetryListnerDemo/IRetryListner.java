package TestNGDemo.IRetryListnerDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryListner implements IRetryAnalyzer {
    private int count=0;
    private static final int max=3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count<=max){
            System.out.println("Coount"+count);
            count++;
            return false;
        }
        return true;
    }
}
