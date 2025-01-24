package CollectionsDemo.ListDemo;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    @Test
    public void Test1(){
        List al=new ArrayList<>();
        al.add(0,1);
        al.add(2);
        System.out.println(al);
    }
    @Test
    public void Test2(){
        List li=new ArrayList(10);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(2,7);
        System.out.println(li);
        li.set(3,0);
        System.out.println(li);
    }
    @Test
    public void Test3(){
        List li=new ArrayList(10);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add("madhu");
       for(int i=0;i<=3;i++){
           System.out.println(li.get(i));
       }
       li.remove(1);
       li.remove("madhu");
        System.out.println(li);
    }
    @Test
    public void TIndex(){
        List li=new ArrayList(10);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(1);
        System.out.println(li.indexOf(1));
        System.out.println(li.lastIndexOf(1));
    }
}
