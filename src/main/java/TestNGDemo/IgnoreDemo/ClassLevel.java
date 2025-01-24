package TestNGDemo.IgnoreDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class ClassLevel {
    @Test
    public void A(){
        System.out.println("A");
    }
    @Test
    public void B(){
        System.out.println("B");
    }
}
