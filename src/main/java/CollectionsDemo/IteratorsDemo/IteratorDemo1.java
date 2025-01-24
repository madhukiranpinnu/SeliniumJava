package CollectionsDemo.IteratorsDemo;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo1 {
    @Test
    public void Test1(){
        LinkedList linkedList=new LinkedList();
        linkedList.add(1);
        linkedList.addFirst(2);
        linkedList.addLast(3);
        linkedList.add(4);
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext()){
            Integer i=(Integer) iterator.next();
            if(i==3){
                iterator.remove();
            }
        }
    }
}
