package TestNGDemo.IgnoreDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void A(){
        System.out.println("A");
    }
    @Test
    @Ignore
    public void B(){
        System.out.println("B");
    }
}
