package org.example.repository;


public class DistanceBWWords {

    public static int minDistance(String str, String word1, String word2){

        String[] words = str.split(" ");
        int index1 = -1, index2 = -1;
        int minDistance = Integer.MAX_VALUE;

        for(int i=0; i< words.length; i++){
            if(words[i].equals(word1)){
                index1 = i;
                if(index2 != -1){
                    minDistance=Math.min(minDistance, index1 - index2);
                }
            }
            if(words[i].equals(word2)){
                index2 = i;
                if (index1 != -1){
                    minDistance = Math.min(minDistance, index2 - index1);
                }
            }
        }

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }

    public static void main(String[] args) {
        /* String str="the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog"; */
        String str="return the minimum distance between the words  distance between the words";
        String word1 = "return";
        String word2 = "words";
        int distance = minDistance(str, word1, word2);
        System.out.println("Min Distance b/w words is:" + distance);
    }
}
