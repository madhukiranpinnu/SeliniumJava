package oopsConcept.MethodOverridingDemo.Rules;
class A{
        void m1() throws ArithmeticException{
        System.out.println("m1");
    }
}
class B extends A{
        protected void m1() throws NullPointerException {
        System.out.println("m1-Subclass");
    }
}
public class Test {
    public static void main(String[] args) {
        A b=new B();
        b.m1();
    }
}
