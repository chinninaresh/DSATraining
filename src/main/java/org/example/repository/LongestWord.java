package org.example.repository;

import java.util.List;
import java.util.ArrayList;


public class LongestWord {
    public static void main(String[] args) {

        String[] dic = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "moDJ", "LODGESSSS" };

        //List<String> dictionary = List.of(dic);

        String substringToSearch = "ODG";

        int longestLength = findLongestWordLength(dic, substringToSearch);
        System.out.println("Length of the longest word containing the substring: " + longestLength);
    }

    private static int findLongestWordLength(String[] str, String s2) {

        int maxLength=-1;
        for(int i=0;i<str.length;i++){
            // boolean contains=false;
            for(int j=0;j<str[i].length();j++){

                if(s2.charAt(0)== (str[i].charAt(j))){
                    //contains = true;
                    for(int k=1;k<s2.length();k++){
                        if(s2.charAt(k)!= (str[i].charAt(j+k))){
                            break;
                        }
                        if(maxLength<str[i].length()){

                            maxLength=str[i].length();
                        }
                    }

                }
            }

        }

        return maxLength;
    }

}
