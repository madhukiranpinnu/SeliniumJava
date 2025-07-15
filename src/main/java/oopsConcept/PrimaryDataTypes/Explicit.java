package oopsConcept.PrimaryDataTypes;

public class Explicit {
    public static void main(String[] args) {
        double d=100.0;
        float f=(float) d;
        long l=(long)f;
        int i=(int) l;
        short s=(short) i;
        byte b=(byte) s;
        System.out.println(s);
        System.out.println(b);
        System.out.println(l);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
    }
}
