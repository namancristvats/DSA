package Array_Recursion;

public class LinearSearchUsingRecursion {
    public static void main(String [] args){
        int arr[]={1,2,3,4,11,6,7,8,9};
        int target=10;
        System.out.println(search(arr,0,target));

    }
    private static int search(int arr[],int s,int target){
        if(s==arr.length){
            return -1;
        }
        if(arr[s]==target){
            return s;
        }
        return search(arr,s+1,target);
    }
}
