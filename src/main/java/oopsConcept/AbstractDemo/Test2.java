package oopsConcept.AbstractDemo;
abstract class A1{
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
abstract class B1 extends  A1{
    void m1(){
        System.out.println("m1");
    }
}
class C1 extends B1{

    @Override
    void m2() {
        System.out.println("M2");
    }

    @Override
    void m3() {
        System.out.println("m3");
    }
}


public class Test2 {
    public static void main(String[] args) {
        A1 a1=new C1();
        a1.m1();
        a1.m2();
        a1.m3();
    }
}
