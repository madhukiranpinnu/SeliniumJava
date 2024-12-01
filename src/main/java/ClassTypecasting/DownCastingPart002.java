package ClassTypecasting;
class Z{
    void m1(){
        System.out.println("m1");
    }
}
class Y extends  Z{
    void m2(){
        System.out.println("m2");
    }
}
class  X extends  Y{
    void m3(){
        System.out.println("m3");
    }
}
public class DownCastingPart002 {
    public static void main(String[] args) {
        Z z =new X();
        Y y=(Y)z;
        y.m1();
        y.m2();
    }
}
