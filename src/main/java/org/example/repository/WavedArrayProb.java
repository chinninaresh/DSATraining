package org.example.repository;

import java.util.Arrays;

public class WavedArrayProb {
    public static void main(String[] args) {
        int[] arr = {10,5,6,3,2,20,100,80};
        int[] result = getWaveArray(arr);
        System.out.println("Waved array is:"+Arrays.toString(result));
    }
    public static int[] getWaveArray(int[] arr){
        Arrays.sort(arr);
        int[] res=new int[arr.length];
        int i=0, j=arr.length-1, k=0;
        while(i<=j){
            res[k++]=arr[j--];
            if(i<j)
                res[k++]=arr[i++];
        }
        return res;
    }
}
