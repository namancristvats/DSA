package Array_Recursion;

import java.util.ArrayList;

public class LinearSearchMultipleOccurence {
    public static void main(String [] args){
        int arr[]={1,11,3,4,11,6,7,8,9};
        int target=11;
        int arr1[]={1,11,10,4,11,6,10,8,9};
        int target1=10;
 /*       ArrayList<Integer> ans=search(arr,0,target,new ArrayList<Integer>());
        System.out.print(ans);
*/
        ArrayList<Integer> ans1=search2(arr1,0,target1);
        System.out.print(ans1);

    }
//    private static ArrayList<Integer>  search(int[] arr, int s, int target,ArrayList<Integer> result){
//        if(s==arr.length){
//            return result;
//        }
//        if(arr[s]==target){
//            result.add(s);
//        }
//        return search(arr,s+1,target,result);
//    }
    private static ArrayList<Integer>  search2(int[] arr, int s, int target){
        ArrayList<Integer> result=new ArrayList<>();
        if(s==arr.length){
            return result;
        }
        if(arr[s]==target){
            result.add(s);
        }
        ArrayList<Integer> answerFrombove=search2(arr,s+1,target);
        result.addAll(answerFrombove);

        return result;
    }
}
