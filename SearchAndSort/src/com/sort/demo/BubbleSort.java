package com.sort.demo;

public class BubbleSort {

    public static void main(String[] args){
        int[] arr = {8,5,2,3,7,9,1};
        System.out.println("before sort ---- ");
        for(int content: arr){
            System.out.print(content + " ");
        }
        //bubble sort start
        System.out.println();
        System.out.println("during sort ---- ");
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int content: arr){
                System.out.print(content + " ");
            }
            System.out.println();
        }

        System.out.println("after sort ---- ");
        for(int content: arr){
            System.out.print(content + " ");
        }
    }

}
