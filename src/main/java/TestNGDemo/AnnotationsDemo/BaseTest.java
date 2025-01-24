package TestNGDemo.AnnotationsDemo;

import org.testng.annotations.*;

public class BaseTest {
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("After Test");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before Class-main ");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("after Class-main ");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("after Suite");
    }
    @BeforeGroups(groups = {"sl"})
    public void BeforeGroups(){
        System.out.println("Before Groups");
    }
    @AfterGroups(groups = {"mk"})
    public void AfterGroups(){
        System.out.println("After groups");
    }
}
