package oopsConcept.DemoInterface;
interface I{
    int i=10;
    void m1();
    void m2();
    void m3();
}
class A implements I{

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
    public void m4(){
        System.out.println("m4");
    }
}

public class Test001 {
    public static void main(String[] args) {
        I i=new A();
        i.m1();
        i.m2();
        i.m3();
        A a=new A();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
        System.out.println(A.i);
        System.out.println(a.i);
        System.out.println(I.i);
        System.out.println(i.i);
    }
}
