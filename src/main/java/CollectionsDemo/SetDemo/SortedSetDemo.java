package CollectionsDemo.SetDemo;

import org.testng.annotations.Test;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    @Test
    public void Test1(){
        SortedSet sortedSet=new TreeSet();
        sortedSet.add(1);
        sortedSet.add(2);
        sortedSet.add(3);
        sortedSet.add(4);
        sortedSet.add(5);
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());
        System.out.println(sortedSet.headSet(3));
        System.out.println(sortedSet.tailSet(3));
        System.out.println(sortedSet.subSet(2,4));
    }
}
