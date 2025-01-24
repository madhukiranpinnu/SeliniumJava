package JavaProgramsTest;

import java.util.Scanner;

public class T2Table {
    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        while (i<=10){
            System.out.println(n+" * "+i+" = "+i*n);
            i++;
        }
    }
}
