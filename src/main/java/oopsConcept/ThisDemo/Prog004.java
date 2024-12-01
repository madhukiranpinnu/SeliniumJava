package oopsConcept.ThisDemo;

public class Prog004 {
    Prog004(){
        this(1);
        System.out.println("1");
    }
    Prog004(int i){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Prog004 p=new Prog004();
    }
}
