package Array_Recursion;

public class SortedArray {
    public static void main(String [] args){
        int arr[]={1,2,3,4,11,6,7,8,9};
        System.out.println(sorted(arr,0));

    }
    public static boolean sorted(int [] arr,int s){
        if(s==arr.length-1){
            return true;
        }

        return arr[s]<arr[s+1] && sorted(arr,s+1);
    }
}
