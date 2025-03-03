package Recursion_Pattern_Bubble_Insertion_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int arr[]={5,5,8,4,6,3,2,7,5};
        bubble(arr,arr.length-1,0);
        System.out.print(Arrays.toString(arr));

    }
    private static void bubble(int a[],int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(a[c]>a[c+1]){
                int temp=a[c];
                a[c]=a[c+1];
                a[c+1]=temp;
            }
            bubble(a,r,c+1);
        }
        else{
            bubble(a,r-1,0);
        }
    }
}
