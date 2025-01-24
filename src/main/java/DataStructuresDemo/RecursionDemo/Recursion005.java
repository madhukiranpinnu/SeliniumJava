package DataStructuresDemo.RecursionDemo;

public class Recursion005 {
    public static void Fibonacci(int i,int j,int k,int stop,int counter){
        if(counter==stop){
            return;
        }
        i=j;
        j=k;
        k=i+j;
        counter++;
        System.out.println(k);
        Fibonacci(i,j,k,stop,counter);
    }

    public static void main(String[] args) {
        int i=0;
        int j=1;
        System.out.println(i);
        System.out.println(j);
        Fibonacci(i,j,1,10,1);
    }
}
