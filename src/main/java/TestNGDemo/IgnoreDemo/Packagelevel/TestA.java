package TestNGDemo.IgnoreDemo.Packagelevel;

import org.testng.annotations.Test;

public class TestA {
    @Test
    public void A(){
        System.out.println("A");
    }
    @Test
    public void B(){
        System.out.println("B");
    }
}
