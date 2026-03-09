package com;

public class ArrayEx {

    public static void main(String[] args) {

        int[] arr = {78,89,41,54,67};

        int arrsum = arr[1] + arr[3];
        System.out.println(arrsum);

        int[] arr1 = {15,17,5,9,13};

        
        arr1[0] = arr1[0] + arr[0];
        arr1[1] = arr1[1] + arr[1];
        arr1[2] = arr1[2] + arr[2];
        arr1[3] = arr1[3] + arr[3];
        arr1[4] = arr1[4] + arr[4];

        
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        
        int sum= arr1[0]+arr1[1]+