package com;

import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        System.out.println("Enter elements in an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After reversing array");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
