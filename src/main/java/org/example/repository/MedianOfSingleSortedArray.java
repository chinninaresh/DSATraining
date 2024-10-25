package org.example.repository;

public class MedianOfSingleSortedArray {
    public static void main(String[] args) {
        int[] sortedArray1 = {1,3,5,7,9,10,11,14};
        int[] sortedArray2 = {1,2,3,4,5,6,7};
        System.out.println("Median of sortedArray1:"+findMedian(sortedArray1));
        System.out.println("Median of sortedArray2:"+findMedian(sortedArray2));
    }
    public static double findMedian(int[] sortedArray){
        int n = sortedArray.length;
        if(n%2 == 1){
            return sortedArray[n/2];
        }else{
            int mid1 = n/2-1;
            int mid2 = n/2;
            return(sortedArray[mid1]+sortedArray[mid2])/2.0;
        }
    }
}
/*
* 1) input array:
*       sortedArray is the sorted array of which we want to find the median
* 2) Finding the median:
*       Odd Length:
*           if the array length('n') is odd, the median is simply the meddle elements.
*           The indices of these elements are 'n/2-1' an n/2
*           The average is computed and returned as a double to handle cases where the result is ot an integer.
* 3) Handle Even Length:
*       The average calculation '(sortedArray[mid1]+sortedArray[mid2])/2.0'
*       ensure that the result is a floating-point number, even if both elements are integers
*
*
* */