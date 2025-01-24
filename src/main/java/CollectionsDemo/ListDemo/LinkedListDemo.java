package CollectionsDemo.ListDemo;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    @Test
    public void Test1(){
       LinkedList li=new LinkedList<>();
       li.add(1);
       li.add(2);
       li.addFirst(4);
       li.addLast(3);
        System.out.println(li);
    }
    @Test
    public void Test2(){
        LinkedList li=new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(4);
        li.add(3);
        li.removeFirst();
        li.removeLast();
        System.out.println(li);
    }
    @Test
    public void Test3(){
        LinkedList li=new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(4);
        li.add(3);
        System.out.println(li.getFirst());
        System.out.println(li.getLast());
    }
}
