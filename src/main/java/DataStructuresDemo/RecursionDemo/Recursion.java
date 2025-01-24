package DataStructuresDemo.RecursionDemo;
public class Recursion {
    public static void PrintNum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        PrintNum(n-1);
    }
    public static void main(String[] args) {
        //Print numbers from 6 to 1
        PrintNum(6);
    }
}
