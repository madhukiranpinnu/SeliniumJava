package DataStructuresDemo.RecursionDemo;
public class Recursion002 {
    public static void PrintNum(int n){
        //Print from 1 to 6
        if(n==6){
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
    }

    public static void main(String[] args) {
        PrintNum(1);
    }
}
