package CollectionsDemo.SetDemo;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHAshSetDemo {
    @Test
    public void Test(){
        HashSet hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add("A");
        hashSet.add(true);
        System.out.println(hashSet);
        LinkedHashSet linkedHashSet=new LinkedHashSet<>(hashSet);
        System.out.println(linkedHashSet);
    }
}
