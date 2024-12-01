package oopsConcept.ThisDemo;

public class Prog005 {
    public Prog005 m1(){
       Prog005 p2=new Prog005();
       return p2;
    }
    public Prog005 m2(){
        return this;
    }

    public static void main(String[] args) {
        Prog005 pl=new Prog005();
        System.out.println(pl);
        System.out.println(pl.m1());
        System.out.println(pl.m1());
        System.out.println(pl.m1());
        System.out.println(pl.m2());
        System.out.println(pl.m2());
        System.out.println(pl.m2());
    }
}
