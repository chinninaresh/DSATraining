package org.example.repository;
import java.util.HashMap;
import java.util.Map;
public class NonRepeatedLetter {

    public static void main(String[] args) {

        String input = "kkruuttjsss";
        char result = repeatLetter(input);

        if(result!='\0'){

            System.out.println("first repeat leetter is : " + result);
        }
        else {
            System.out.println("No no repeat leeter");
        }
    }
    public static char repeatLetter(String str) {

        HashMap<Character, Integer> repeatCount= new HashMap<Character,Integer>();

        for(char ch: str.toCharArray()) {

            repeatCount.put(ch, repeatCount.getOrDefault(ch,0) + 1);
        }

        for(Map.Entry<Character , Integer> entry: repeatCount.entrySet()){

            if(entry.getValue()==1){
                return entry.getKey();

            }
        }
        return '\0';

    }
}
