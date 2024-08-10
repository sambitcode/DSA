package com.sort.demo;

public class MergeSort {

    /** This method will divide the array from mid point.
     * We will call this method recursively till each array contains
     * only one element*/
    private static void divide(int[] arr, int startIndx, int endIndx){
        if(startIndx>=endIndx){
            //here we divided the arr till single element so returning
            return;
        }
        //need to calculate mid first
        //we wont use (startIndx+endIndx)/2.
        //As This can create space issue in case both are very large.
        int mid = startIndx + (endIndx-startIndx)/2;
        //now recursively call divide. One for left side of mid.
        //And one for right side of the mid.
        divide(arr,startIndx,mid);
        divide(arr,mid+1,endIndx);
        //now we need to conquer
        conquer(arr, startIndx, endIndx, mid);


    }

    private static void conquer(int[] arr, int startIndx, int endIndx, int mid) {
        int[] merged = new int[endIndx-startIndx+1];
        //idx1 will track first array
        int idx1 = startIndx;
        //idx2 will track second array
        int idx2 = mid+1;
        //this will be used to place values in merged
        int x = 0;
        while(idx1<=mid && idx2<=endIndx){
            if(arr[idx1]<=arr[idx2]){
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        //if there are element left in first array
        //and element finished in second array
        // then copy all the element of first array
        // into the rest part of merged array
        while(idx1<=mid){
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
        //if there are element left in second array
        //and element finished in first array
        // then copy all the element of second array
        // into the rest part of merged array
        while(idx2<=endIndx){
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }
        //now we need to copy value of merged array in original array
        for(int i=0,j=startIndx;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
        System.out.println();
        System.out.println("during sort ---- ");
        for(int content: arr){
            System.out.print(content + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {8,5,2,3,7,9,1};
        System.out.println("before sort ---- ");
        for(int content: arr){
            System.out.print(content + " ");
        }
        // need to have recursive function
        divide(arr,0,arr.length-1);
        System.out.println();
        System.out.println("after sort ---- ");
        for(int content: arr){
            System.out.print(content + " ");
        }
    }

}
