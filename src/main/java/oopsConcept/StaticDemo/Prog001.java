package oopsConcept.StaticDemo;

public class Prog001 {
    static int im=1;

    public static void main(String[] args) {
        Prog001 prog001=new Prog001();
        System.out.println(prog001.im);
        System.out.println(Prog001.im);
    }
}
