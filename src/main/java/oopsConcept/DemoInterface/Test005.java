package oopsConcept.DemoInterface;
interface Z1{
    void m1();
}
interface z2 extends Z1{
    void m2();
}
class JK implements z2{

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m1() {
        System.out.println("m1");
    }
}
public class Test005 {
    public static void main(String[] args) {
        JK jk=new JK();
        jk.m1();
        jk.m2();
    }
}
