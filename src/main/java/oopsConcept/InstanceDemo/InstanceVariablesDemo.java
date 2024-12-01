package oopsConcept.InstanceDemo;

public class InstanceVariablesDemo {
    int i=10;
    InstanceVariablesDemo(){
        System.out.println("Constructor loading");
    }
    public void get(){
        i=20;
        System.out.println(i);
    }
    public static void main(String[] args) {
       InstanceVariablesDemo i=new InstanceVariablesDemo();
       i.get();
    }
}
