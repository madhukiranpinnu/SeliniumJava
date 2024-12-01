package oopsConcept.Demosuper;
class OP{
    OP(){
        System.out.println("OP");
    }
    OP(int i){
        System.out.println("Param-OP");
    }
}
class PS extends  OP{
    PS(){
        super(10);
//        super();
        System.out.println("PS");
    }
}
public class Prog003 {
    public static void main(String[] args) {
        PS ps=new PS();
    }
}
