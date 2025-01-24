package JavaProgramsTest;

import org.testng.annotations.Test;

import java.util.HashMap;

public class T8LettersInWord {
    @Test
    public void Test1(){
     String word="madhu kiran pinnu";
        HashMap<Character,Integer> hashMap=new HashMap<>();
     for(int i=0;i<word.length();i++){
         if(!hashMap.containsKey(word.charAt(i))){
             hashMap.put(word.charAt(i),1);
         }
         else {
             hashMap.put(word.charAt(i),hashMap.get(word.charAt(i))+1);
         }
     }
        System.out.println(hashMap);
    }
}
