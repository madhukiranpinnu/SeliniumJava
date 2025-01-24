package TestNGDemo.PriorityDemo;

import org.testng.annotations.Test;

public class PriorityHere {
    @Test(priority = 1)
    public void A(){
        System.out.println("A");
    }
    @Test(priority = 2)
    public void B(){
        System.out.println("B");
    }
    @Test(priority = 0)
    public void C(){
        System.out.println("C");
    }
    @Test(priority = -1)
    public void D(){
        System.out.println("D");
    }
    @Test(priority = -3)
    public void F(){
        System.out.println("F");
    }
}
