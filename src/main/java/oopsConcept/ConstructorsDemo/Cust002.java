package oopsConcept.ConstructorsDemo;

public class Cust002 {
    Cust002(){
        System.out.println("No-Arg");
    }
    Cust002(int i){
        System.out.println(i);
    }
    public static void main(String[] args) {
     Cust002 cust002=new Cust002();
     Cust002 cust0021=new Cust002(10);
    }
}
