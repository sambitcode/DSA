package com.search.demo;

public class Search {

    public static void main(String[] args){
        int[] nums = {5,6,12,13,15,21,22,28,32,34,38,45,65,67};
        int target = 5;
        int linearResult = linearSearchMethod(nums, target);
        if(linearResult == -1){
            System.out.println("No value found");
        } else {
            System.out.println("value found at the index : " + linearResult);
        }
        int binaryResult = binarySearchMethod(nums, target);
        if(binaryResult == -1){
            System.out.println("No value found");
        } else {
            System.out.println("value found at the index : " + binaryResult);
        }
        int binaryRecResult = binarySearchRecursiveMethod(nums, target, 0, nums.length-1);
        if(binaryRecResult == -1){
            System.out.println("No value found");
        } else {
            System.out.println("value found at the index : " + binaryRecResult);
        }

    }

    private static int linearSearchMethod(int[] nums, int target) {
        for(int i =0; i< nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    private static int binarySearchMethod(int[] nums, int target) {
        /* in binary input array has to be sorted in ascending order*/
        /*steps not required. it is just to check the steps taken by algo*/
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(target == nums[mid]){
                return mid;
            } else if(target < nums[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }


    private static int binarySearchRecursiveMethod(int[] nums, int target, int start, int end) {
        /* in binary input array has to be sorted in ascending order*/
        if(start <= end){
            //int mid = (start+end)/2;
            int mid = start+(end-start)/2;
            if(target == nums[mid]){
                return mid;
            } else if(target < nums[mid]){
                return binarySearchRecursiveMethod(nums, target, start, mid-1);
            } else{
                return binarySearchRecursiveMethod(nums, target, mid+1, end);
            }
        }
        return -1;
    }

}
