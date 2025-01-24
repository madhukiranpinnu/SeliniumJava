package JavaProgramsTest;

public class T13ArmStrongNumber {
    public static void main(String[] args) {
        int num=153;
        System.out.println(153%10);
        int sum=0;
        while (num>0){
         int k=num%10;
         sum=sum+(k*k*k);
         num=num/10;
        }
        System.out.println(sum);
    }
}
