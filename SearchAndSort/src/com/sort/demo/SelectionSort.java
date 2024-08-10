package com.sort.demo;

public class SelectionSort {

    public static void main(String[] args){
        int[] arr = {8,5,2,3,7,9,1};
        System.out.println("before sort ---- ");
        for(int content: arr){
            System.out.print(content + " ");
        }
        //selection sort start
        System.out.println();
        System.out.println("during sort ---- ");
        for(int i=0; i<arr.length-1; i++){
            int smallestValueIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[smallestValueIndex]){
                    smallestValueIndex = j;
                }
            }
            int temp = arr[smallestValueIndex];
            arr[smallestValueIndex] = arr[i];
            arr[i] = temp;
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
