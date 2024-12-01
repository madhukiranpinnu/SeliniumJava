package oopsConcept.ThisDemo;

public class Prog001 {
    int a=10;
    int b=20;
    Prog001(int a, int  b){
        //This at variable level
        System.out.println(a+"------"+b);
        System.out.println(this.a+"___________"+this.b);
    }

    public static void main(String[] args) {
        Prog001 prog001=new Prog001(1,3);
    }
}
