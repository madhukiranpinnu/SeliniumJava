package JavaProgramsTest.ListProbs;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfLists {
    @Test
    public void Test1(){
        List list=new ArrayList(Arrays.asList(1,2,3,4,5,6,7));
        List list1=new ArrayList(Arrays.asList(2,3,5,6,7,8));
        list.retainAll(list1);
        System.out.println(list);
    }
}
