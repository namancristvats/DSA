package EasyRecursion;

public class SumOfNumbers {
    public static void main(String[] args){
        int n=5;
        System.out.print(product(n));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static int product(int n){
        if(n==1){
            return n;
        }
        return n*product(n-1);
    }
}
