package Maths;

import static java.lang.Math.sqrt;

public class SqrtBinarySearch {
    public static void main(String [] args){
     int n=40;
     int precision=3;
     double ans=root(n,precision);
     System.out.printf("%.3f",ans);
    }
    public static double root(int n, int p){
        int s=0;
        int e=n;
        double root=0.0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid*mid==n){
                root=mid;
                return root;
            }
            if(mid*mid>n){
                e=mid-1;
            }
            if(mid*mid<n){
                s=mid+1;
            }
        }
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr=incr/10;
        }
        return root;
    }
}
