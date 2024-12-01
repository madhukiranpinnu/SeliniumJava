package oopsConcept.ConstructorsDemo;

public class Custruct001 {
    int i;
    int k;
    private  Custruct001(){
        i=10;
        k=23;
    }
    public void add(){
        System.out.println(i+k);
    }

    public static void main(String[] args) {
        Custruct001 custruct001=new Custruct001();
        custruct001.add();
    }
}
