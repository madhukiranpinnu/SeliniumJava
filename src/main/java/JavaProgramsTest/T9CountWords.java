package JavaProgramsTest;

import java.util.HashMap;
import java.util.Map;

public class T9CountWords {
    public static void main(String[] args) {
        String words="Madhu is here is Madhu";
        String[] splitted=words.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(String word:splitted){
            if(!map.containsKey(word)){
                map.put(word,1);
            }
            else {
                map.put(word,map.get(word)+1);
            }
        }
        System.out.println(map);
    }
}
