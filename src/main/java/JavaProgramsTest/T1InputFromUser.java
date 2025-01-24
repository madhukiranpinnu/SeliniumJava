package JavaProgramsTest;

import java.util.Scanner;

public class T1InputFromUser {
    public static void main(String[] args) {
        System.out.println("Ready to enter Details: ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        System.out.println("Name is : "+name);
        System.out.println("age is : "+age);
    }
}
