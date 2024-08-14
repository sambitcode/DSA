package com.sort.demo;

public class QuickSort {

    private static void quickSort(int[] arr, int low, int high){
        if(low<high){
            //will get pivot index first
            int pivotIndex = partition(arr, low, high);
            //once we get pivot we need to call quickSort two times
            //first with elements in the left of pivot
            quickSort(arr, 0, pivotIndex-1);
            //second time with elements right of pivot
            quickSort(arr, pivotIndex+1, high);
        }
    }

    /** this metghod will iterate and put pivot into right place and return back pivotIndex*/
    private static int partition(int[] arr, int low, int high) {
        //get pivot value
        int pivot = arr[high];
        //assign variable i = low-1.
        //this will be used to make space for smaller element in the left of pivot
        int i = low-1;
        for(int j =low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        //here we need to make one space for pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high]= temp;
        return i;
    }

    public static void main(String[] args){
        int[] arr = {8,5,2,3,7,9,1};
        // need to have recursive function
        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("after sort ---- ");
        for(int content: arr){
            System.out.print(content + " ");
        }
    }

}
