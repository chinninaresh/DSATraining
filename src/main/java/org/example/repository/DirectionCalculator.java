package org.example.repository;

import java.util.LinkedHashMap;
import java.util.Map;

public class DirectionCalculator {

    // Using Sample code
   /** public static int[] finalCoordinates(String directions){

        int x = 0;
        int y = 0;

        for(char direction : directions.toCharArray()){
            switch (direction){
                case 'U' : y++;
                break;
                case 'D' : y--;
                break;
                case 'R' : x++;
                break;
                case 'L' : x--;
                break;
            }
        }
        return new int[]{x,y};
    } **/

    // Using hashMap to map each direction
    public static int[] finalCoordinates(String directions){

        int x = 0, y=0;

        Map<Character, int[]> directionMap = new LinkedHashMap<>();
        directionMap.put('U', new int[]{0, 1});
        directionMap.put('D', new int[]{0, -1});
        directionMap.put('L', new int[]{-1, 0});
        directionMap.put('R', new int[]{1, 0});
        for(char direction : directions.toCharArray()){
            int[] change = directionMap.get(direction);
            if(change != null){
                x+=change[0];
                y+=change[1];
            }
        }
        return new int[]{x,y};

    }

    public static void main(String[] args) {

        //String directions="UUULL"; // O/P will be (-2, 3)
        //String directions="URRDDL"; // O/P will be (1, -1)
        String directions="DURRDLLL"; // O/P will be (-1, -1)
        //String directions="UUDDRL"; // O/P will be (0, 0)

        int[] finalPositions=finalCoordinates(directions);
        System.out.println("Final Coordinates:"+ finalPositions[0] + ","+ finalPositions[1]);
    }
}
