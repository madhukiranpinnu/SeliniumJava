package oopsConcept.InterfaceDemo;

public class Test {
    public static void main(String[] args) {
        Implementationclass001 implementationclass001=new Implementationclass001();
        implementationclass001.m1();
        implementationclass001.m2();
        Demo demo=new Implementationclass001();
        demo.m1();
        System.out.println(demo.i);
        System.out.println(Demo.i);
        System.out.println(Implementationclass001.i);
        System.out.println(implementationclass001.i);
    }
}
