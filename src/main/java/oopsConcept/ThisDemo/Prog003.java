package oopsConcept.ThisDemo;

public class Prog003 {
    private int i;
    public int getIy() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        Prog003 prog003=new Prog003();
        prog003.setI(3);
        System.out.println(prog003.getIy());
    }

}
