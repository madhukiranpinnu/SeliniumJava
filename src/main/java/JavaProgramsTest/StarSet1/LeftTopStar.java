package JavaProgramsTest.StarSet1;

import org.testng.annotations.Test;

public class LeftTopStar {
/*
     *
    **
   ***
  ****
 *****
 */
    @Test
    public void Test1(){
        for(int i=0;i<=5;i++){
            for (int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*
    1
   22
  333
 4444
55555
 */
    @Test
    public void Test2(){
        for(int i=0;i<=5;i++){
            for (int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
/*
    1
   12
  123
 1234
12345
 */
    @Test
    public void Test3(){
        for(int i=0;i<=5;i++){
            for (int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
/*
   A
   BB
  CCC
 DDDD
EEEEE
 */
    @Test
    public void Test4(){
        for(int i=0;i<=5;i++){
            for (int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }

/*
    A
   AB
  ABC
 ABCD
ABCDE
 */
    @Test
    public void Test5(){
        for(int i=0;i<=5;i++){
            for (int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print((char)(k+64));
            }
            System.out.println();
        }
    }

}
