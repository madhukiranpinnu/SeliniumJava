package oopsConcept.Demosuper;
class A{
    int i=1;
    int j=2;
}
class B extends A{
    int i=11;
    int j=22;
    public void m1(int i,int j){
        System.out.println(i+"_____________"+j);
        System.out.println(this.i+"____________"+this.j);
        System.out.println(super.i+"________________"+super.j);
    }
}

public class Prog001 {
    public static void main(String[] args) {
        B b=new B();
        b.m1(50,60);
    }
}
