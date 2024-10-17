package org.example.repository;

public class CharSubString {

    public static void main(String[] args){

        String str = "ededdddkkkeetttt";
        int[] result = findLongestSameCharacterSubstring(str);

        System.out.println("Starting index: " + result[0]);
        //System.out.println("Length: " + result[1]);
        System.out.println("Substring: " + str.substring(result[0], result[0] + result[1]));
    }
    public static int[] findLongestSameCharacterSubstring(String str) {
        int maxLength = 1;
        int currentLength = 1;
        int startIndex = 0;
        int longestStartIndex = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    longestStartIndex = startIndex;
                }
                currentLength = 1;
                startIndex = i;
            }
        }
        if (currentLength > maxLength) {
            maxLength = currentLength;
            longestStartIndex = startIndex;
        }
        return new int[]{longestStartIndex, maxLength};


    }
}
