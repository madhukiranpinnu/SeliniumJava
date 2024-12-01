package oopsConcept.ThisDemo;

public class Prog002 {
    public void m1(){
        System.out.println("m1");
        m2();
        this.m2();
    }
    public void m2(){
        System.out.println("m2");
    }

    public static void main(String[] args) {
        Prog002 p1=new Prog002();
        p1.m1();
    }
}
