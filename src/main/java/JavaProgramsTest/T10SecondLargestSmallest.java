package JavaProgramsTest;

import org.testng.annotations.Test;

import java.util.Arrays;

public class T10SecondLargestSmallest {
    @Test
    public void Test(){
        int [] inti={1,3,2,5,6,78,90,75};
        int size=inti.length;
        Arrays.sort(inti);
        System.out.println(inti[size-2]);
        System.out.println(inti[1]);
    }
}
