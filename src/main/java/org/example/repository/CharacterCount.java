package org.example.repository;

import java.util.Map;
import java.util.HashMap;

public class CharacterCount {

    public static void main(String[] args) {

        String input = "aabbejakkdrrtt";
        String output = countLetter(input);

        System.out.println(output);
    }
    public static String countLetter(String str) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for (char ch : str.toCharArray()) {

            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for (char ch1 : count.keySet()) {

            result.append(ch1).append(count.get(ch1));
        }
        return result.toString();
    }

}
