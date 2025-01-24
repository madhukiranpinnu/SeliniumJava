package CollectionsDemo.SetDemo;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    @Test
    public void Test1(){
        Set s=new HashSet<>();
        s.add(1);
        s.add("e");
        s.add(2);
        s.add("89");
        s.add(true);
        s.add(null);
        System.out.println(s);
    }
    @Test
    public void Test2(){
        Set s=new HashSet<>();
        s.add(1);
        s.add("e");
        s.add(2);
        s.add("89");
        s.add(true);
        s.add(null);
        s.add(null);
        System.out.println(s);
    }
}
