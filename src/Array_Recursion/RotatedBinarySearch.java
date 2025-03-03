package Array_Recursion;

public class RotatedBinarySearch {
    public static void main(String [] args){
        int a[]={7,8,9,10,1,2,5,6};
        int ans=rotatedBinarySearch(a,0,a.length-1,5);
        System.out.print(ans);

    }
    private static int rotatedBinarySearch(int a[],int s,int e,int target){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(a[m]==target){
            return m;
        }
        if(a[s]<=a[m]){
            if(target>=a[s] && target<=a[m]){
                return rotatedBinarySearch(a,s,m-1,target);
            }
            else{
                return rotatedBinarySearch(a,m+1,e,target);
            }
        }
        if(target>=a[m]&&target<=a[e]){
            return rotatedBinarySearch(a,m+1,e,target);
        }
        else{
            return rotatedBinarySearch(a,s,m-1,target);
        }
    }
}
