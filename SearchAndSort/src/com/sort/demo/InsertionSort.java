package com.sort.demo;

public class InsertionSort {

    public static void main(String[] args){
        int[] arr = {8,5,2,3,7,9,1};
        //InsertionSort start
        for(int i=1; i<arr.length; i++){
            int j = i-1;
            int key = arr[i];
            while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("after sort ---- ");
        for(int content: arr){
            System.out.print(content + " ");
        }
    }

}
