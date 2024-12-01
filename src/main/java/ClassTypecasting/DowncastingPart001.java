package ClassTypecasting;
class A1{
    void m1(){
        System.out.println("m1");
    }
}
class B1 extends A1{
    void m2(){
        System.out.println("m2");
    }
}
public class DowncastingPart001 {
    public static void main(String[] args) {
//        A1 a=new A1();
//        B1 b=a;
        A1 a1=new B1();
        B1 b1=(B1) a1;
        b1.m2();
        b1.m1();
    }
}
