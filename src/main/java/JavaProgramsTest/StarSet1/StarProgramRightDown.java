package JavaProgramsTest.StarSet1;

import org.testng.annotations.Test;

public class StarProgramRightDown {
/*
 * * * * *
 * * * *
 * * *
 * *
 *
 */
    @Test
    public void Test1(){
        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
/*
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
 */
    @Test
    public void Test2(){
        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
 */
    @Test
    public void Test3(){
        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
/*
B B B B B
C C C C
D D D
E E
F
 */
    @Test
    public void Test4(){
        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print((char)(i+65) +" ");
            }
            System.out.println();
        }
    }
/*
E D C B A
E D C B
E D C
E D
E
 */
    @Test
    public void Test5(){
        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print((char)(j+64) +" ");
            }
            System.out.println();
        }
    }
}
