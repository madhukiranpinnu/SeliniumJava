package oopsConcept.AbstractDemo;
abstract class A {
    abstract void m1();

    abstract void m2();

    void m3() {
        System.out.println("Madhukiran");
    }
}
   class B extends A{

       @Override
       void m1() {
           System.out.println("m1");
       }

       @Override
       void m2() {
           System.out.println("m2");
       }
   }

public class Test001 {
    public static void main(String[] args) {
        A a=new B();
        a.m1();
        a.m2();
        a.m3();
    }
}
