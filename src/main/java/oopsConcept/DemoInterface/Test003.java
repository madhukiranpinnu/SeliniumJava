package oopsConcept.DemoInterface;
interface Z{
    void m1();
    void m2();
}
abstract class Y implements Z{
    public void m1(){
        System.out.println("m1");
    }
}
class X extends Y{

    @Override
    public void m2() {
        System.out.println("m2");
    }
}

public class Test003 {
    public static void main(String[] args) {
        Z z=new X();
        z.m1();
        z.m2();
    }
}
