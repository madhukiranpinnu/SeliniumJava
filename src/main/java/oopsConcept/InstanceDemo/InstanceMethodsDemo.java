package oopsConcept.InstanceDemo;

public class InstanceMethodsDemo {
    int i=m1();
    int j=m2();
    public int m1(){
        System.out.println("M1-1");
        return 10;
    }
    public int m2(){
        System.out.println("M2-2");
        return 20;
    }
    InstanceMethodsDemo(){
        System.out.println("No-Arg");
    }
    public static void main(String[] args) {
      InstanceMethodsDemo instanceMethodsDemo=new InstanceMethodsDemo();
    }
}
