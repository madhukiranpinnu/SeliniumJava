package oopsConcept.DemoInterface;
interface UY{
    void m1();
}
class RT{
    void m2(){
        System.out.println("m2");
    }
}
class ER extends RT implements UY{

    @Override
    public void m1() {
        System.out.println("m1");
    }
}
public class Test006 {
}
