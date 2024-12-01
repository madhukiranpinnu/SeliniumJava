package ClassTypecasting;
class A{
    void m1(){
        System.out.println("m1");
    }
}
class B extends A{
    void m2(){
        System.out.println("m2");
    }
}
public class Upcasting001 {
    public static void main(String[] args) {
        B b=new B();
        A a=b;
        a.m1();
        A a1=new B();
        a1.m1();
    }
}
