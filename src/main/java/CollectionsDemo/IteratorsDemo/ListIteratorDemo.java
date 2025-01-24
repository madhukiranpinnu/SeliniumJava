package CollectionsDemo.IteratorsDemo;

import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    @Test
    public void Test(){
       List list=new LinkedList<>();
       for(int i=0;i<=10;i++){
           list.add(i);
       }
        System.out.println(list);
        ListIterator li=list.listIterator();
        while (li.hasNext()){
            System.out.println(li.next()+"___________"+li.nextIndex());
        }
        while (li.hasPrevious()){
            System.out.println(li.previous()+"__________"+li.previousIndex());
        }
    }
    @Test
    public void Test2(){
        List list=new LinkedList<>();
        for(int i=0;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);
        ListIterator li=list.listIterator();
        while (li.hasNext()){
            Integer i=(Integer) li.next();
            if(i%2==0){
                li.set("Even");
            }
            else {
                li.add("ODD");
            }
        }
        System.out.println(list);
    }
}
