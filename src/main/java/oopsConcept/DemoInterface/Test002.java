package oopsConcept.DemoInterface;
interface I1{
    void m1();
}
interface I2{
    void m2();
}
interface I3{
    void m3();
}
class Ar implements I1,I2,I3{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m3() {
        System.out.println("m3");
    }
}
public class Test002 {
    public static void main(String[] args) {
        I1 i1=new Ar();
        i1.m1();
        I2 i2=new Ar();
        i2.m2();
        I3 i3=new Ar();
        i3.m3();
        Ar ar=new Ar();
        ar.m1();
        ar.m2();
        ar.m3();
    }
}
