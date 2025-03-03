package Recursion_Pattern_Bubble_Insertion_sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int arr[]={4,2,5,1,8,9,4,5};
        selection(arr,arr.length,0,0);
        System.out.print(Arrays.toString(arr));

    }
    private static void selection(int a[],int r,int c,int maxIndex){
        if(r==0){
            return;
        }
       if(c<r){
           if(a[c]>a[maxIndex]){
               selection(a,r,c+1,c);
           }else{
               selection(a,r,c+1,maxIndex);
           }
       }else{
           int temp=a[maxIndex];
           a[maxIndex]=a[r-1];
           a[r-1]=temp;
           selection(a,r-1,0,0);
       }
    }
}
