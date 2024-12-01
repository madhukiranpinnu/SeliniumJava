package oopsConcept.InstanceDemo;

public class InstanceBlockDemo {
    {
        System.out.println("Madhu kiran");
    }
    InstanceBlockDemo(){
        System.out.println("Con-IBD");
    }
    int i=m1();
    public int m1(){
        System.out.println("IV_Declaration");
        return 10;
    }

    public static void main(String[] args) {
        InstanceBlockDemo is=new InstanceBlockDemo();
    }
}
