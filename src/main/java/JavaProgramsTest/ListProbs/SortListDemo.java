package JavaProgramsTest.ListProbs;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortListDemo {
    @Test
    public void Test1(){
        List list=new ArrayList<>();
        list.add(1);
        list.add(34);
        list.add(45);
        list.add(5);
        list.add(57);
        Collections.sort(list);
        System.out.println(list);
    }
    @Test
    public void TestReverse(){
        List list=new ArrayList<>();
        list.add(1);
        list.add(34);
        list.add(45);
        list.add(5);
        list.add(57);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
