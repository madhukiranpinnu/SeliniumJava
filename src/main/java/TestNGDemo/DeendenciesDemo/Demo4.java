package TestNGDemo.DeendenciesDemo;

import org.testng.annotations.Test;

public class Demo4 {
    @Test(groups = {"lk"})
    public void Test1(){
        System.out.println("Test 1");
    }
    @Test(groups = {"mk"})
    public void Test2(){
        System.out.println("Test 2");
    }
    @Test(dependsOnGroups = {"mk","lk"})
    public void Test3(){
        System.out.println("Test 3");
    }
}
