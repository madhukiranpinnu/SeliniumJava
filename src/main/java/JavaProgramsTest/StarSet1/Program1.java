package JavaProgramsTest.StarSet1;

import org.testng.annotations.Test;

public class Program1 {
    /*
            *
            * *
            * * *
            * * * *
            * * * * *
    */
    @Test
    public void Test1(){
     for(int i=0;i<5;i++){
         for (int j=0;j<=i;j++){
             System.out.print("* ");
         }
         System.out.println();
     }
    }
    /*
        0
        1 1
        2 2 2
        3 3 3 3
        4 4 4 4 4
     */
    @Test
    public void Test2(){
        for (int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    /*
    0
    0 1
    0 1 2
    0 1 2 3
    0 1 2 3 4
     */
    @Test
    public void Test3(){
        for (int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
/*
A
B B
C C C
D D D D
E E E E E
 */
    @Test
    public void Test4(){
        for (int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print((char)(i+65)+" ");
            }
            System.out.println();
        }
    }
/*
A
A B
A B C
A B C D
A B C D E
 */
    @Test
    public void Test5(){
        for (int i=0;i<5;i++){
            for (int j=0;j<=i;j++){
                System.out.print((char)(j+65)+" ");
            }
            System.out.println();
        }
    }
}
