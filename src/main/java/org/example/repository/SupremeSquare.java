package org.example.repository;

// Calculate the Supreme Square value of a given number (using Java8 concepts):
// 1. Square Each digit and sum them.
// 2. Keep adding all the digits of sum until you reach a single digit
// Ex1: 1234 -> [1 + 4 + 9 + 16] -> 30 -> [3 + 0] -> 3
// Ex2: 42683 -> [16 + 4 + 36 + 64 + 9]-> 129 -> [1 + 2 + 9] -> 12 -> [1 + 2] -> 3

public class SupremeSquare {
    public static void main(String[] args) {
        //String value = "8123889456778899880005";
        String value = "1234";
        int ssv = CalcSupremeSquareVal(value);
        System.out.println(ssv);
    }
    // Complete the below method
    public static int CalcSupremeSquareVal(String value) {

        int sum = value.chars().map(Character::getNumericValue).map(digit -> digit*digit).sum();
        while(sum > 9){
            sum=String.valueOf(sum).chars().map(Character::getNumericValue).sum();

        }
        return sum;
    }
}
