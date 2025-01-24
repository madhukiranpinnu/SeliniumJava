package JavaProgramsTest.ListProbs;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentElementInList {
    @Test
    public void Test(){
        List<Integer> list=new ArrayList();
        list.add(1);
        list.add(34);
        list.add(45);
        list.add(5);
        list.add(57);
        list.add(1);
        list.add(45);
        Map<Integer, Integer> map=new HashMap<>();
        for (int i:list){
            if(map.containsKey(i)){
                map.put(i,1);
            }
            else {
                map.put(i, map.get(i)+1);
            }
        }
        System.out.println(map);
    }
}
