package com.freedom.algoexpert.easy;

public class BinarySearch {
        // Time c : log(n), Space c : log(n)
        static int rBinarySearch(int[] arr, int target, int l, int r){
            int c = (l+r)/2;
            if(l>r){
                return -1;
            }
            if(arr[c]>target){
                return rBinarySearch(arr, target, l, c - 1);
            }else if(arr[c]<target){
                return rBinarySearch(arr, target, c + 1, r);
            }else {
                return c;
            }
        }

        // Time c : log(n), Space c : 1
        static int iBinarySearch(int[] arr, int target){
        int l = 0;
        int index = -1;
        int r = arr.length - 1;
        int c = (l+r)/2;
        while (l<=r){
            if(arr[c]>target){
                r = c - 1;
            }else if(arr[c]<target){
                l = c + 1;
            }else {
                index = c;
                break;
            }
            c = (l+r)/2;
        }

        return index;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(iBinarySearch(arr, 80));
        System.out.println(rBinarySearch(arr, 33, 0, arr.length - 1 ));
    }
}
