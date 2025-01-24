package JavaProgramsTest;

import java.util.Scanner;

public class T3FizzBuzz {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give some number: ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Fizz Buzz");
        }
        else if (n % 5 == 0) {
            System.out.println("Fizz");
        }
        else if (n % 3 == 0) {
            System.out.println("Buzz");

        }
    }
}
