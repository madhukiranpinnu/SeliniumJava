package oopsConcept.StaticDemo;

public class Prog003 {
    static int i=m1();
    int j=34;
    static int m1(){
        System.out.println(i);
        System.out.println("Static method");
        Prog003 prog003=new Prog003();
        System.out.println(prog003.j);
        return 10;
    }
    static void m2(){
        m1();
    }
    public static void main(String[] args) {
        Prog003 prog003=new Prog003();
        prog003.m2();
    }
}
