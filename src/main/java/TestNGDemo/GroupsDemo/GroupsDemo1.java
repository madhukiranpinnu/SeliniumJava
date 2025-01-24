package TestNGDemo.GroupsDemo;

import org.testng.annotations.Test;

public class GroupsDemo1 {
    @Test(groups = {"one"})
    public void A(){
        System.out.println("A");
    }
    @Test(groups = {"two"})
    public void B(){
        System.out.println("B");
    }
}
