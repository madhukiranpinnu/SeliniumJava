package JavaProgramsTest.ListProbs;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    @Test
    public void Test(){
        List list=new ArrayList<>();
        list.add(1);
        list.add(34);
        list.add(45);
        list.add(5);
        list.add(57);
        list.add(1);
        list.add(45);
        System.out.println(list);
        Set set=new HashSet<>(list);
        System.out.println(set);
    }
}
