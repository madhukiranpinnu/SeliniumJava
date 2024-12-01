package oopsConcept.Demosuper;
class A1{
    void m1(){
        System.out.println("M1_A1");
    }
}
class B1 extends A1{
    void m2(){
        System.out.println("M2-B1");
        this.m1();
        super.m1();
    }
    void m1(){
        System.out.println("m1-B1");
    }
}

public class Prog002 {
    public static void main(String[] args) {
        B1 b1=new B1();
        b1.m2();
    }
}
