package TestNGDemo.GroupsDemo;

import org.testng.annotations.Test;

public class GroupsDemo2 {
    @Test(groups = {"two"})
    public void C(){
        System.out.println("C");
    }
    @Test(groups = {"one","two"})
    public void D(){
        System.out.println("D");
    }
}
