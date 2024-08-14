package com.sort.demo;

public class BubbleSort {

    public static void main(String[] args){
        int[] arr = {8,5,2,3,7,9,1};
        //bubble sort start
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("after sort ---- ");
        for(int content: arr){
            System.out.print(content + " ");
        }
    }

}
