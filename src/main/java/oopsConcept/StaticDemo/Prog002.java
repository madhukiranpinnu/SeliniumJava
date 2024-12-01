package oopsConcept.StaticDemo;

public class Prog002 {
    static int i=1;
    public static void main(String[] args) {
        Prog002 prog002=new Prog002();
        prog002.i+=1;
        System.out.println(prog002.i);
        Prog002 prog0021=new Prog002();
        System.out.println(prog0021.i);
    }
}
