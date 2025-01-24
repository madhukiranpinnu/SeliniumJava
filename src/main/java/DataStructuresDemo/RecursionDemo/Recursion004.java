package DataStructuresDemo.RecursionDemo;

public class Recursion004 {
    public static void Factorial(int n,int i,int fact){
        if(n==i){
            System.out.println(fact);
            return;
        }
        fact*=n;
        Factorial(n-1,i,fact);
    }

    public static void main(String[] args) {
        Factorial(5,1,1);
    }
}
