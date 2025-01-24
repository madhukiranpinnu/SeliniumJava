package JavaProgramsTest.StarSet1;

import org.testng.annotations.Test;

public class LeftBottomStar {
/*
 *****
 ****
 ***
 **
 *
 */
    @Test
    public void Test1(){
      for(int i=1;i<=5;i++){
          for(int j=1;j<i;j++){
              System.out.print(" ");
          }
          for (int k=5;k>=i;k--){
              System.out.print("*");
          }
          System.out.println();
      }
    }
/*
11111
 2222
  333
   44
    5
 */
    @Test
    public void Test2(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=5;k>=i;k--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
/*
54321
 5432
  543
   54
    5
 */
    @Test
    public void Test3(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=5;k>=i;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
/*
AAAAA
 BBBB
  CCC
   DD
    E
 */
    @Test
    public void Test4(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=5;k>=i;k--){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
/*
EDCBA
 EDCB
  EDC
   ED
    E
 */
    @Test
    public void Test5(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=5;k>=i;k--){
                System.out.print((char)(k+64));
            }
            System.out.println();
        }
    }
}
