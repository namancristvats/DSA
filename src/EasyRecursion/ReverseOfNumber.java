package EasyRecursion;

public class ReverseOfNumber {
    //one way taking variable outside that do not change with the function calls
    static int rev=0;

    public static void rev1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        rev=rev*10+rem;
        rev1(n/10);
    }
    //another way helper function
    public static int rev2(int n){
        int digit=(int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    public static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        return n%10*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);

    }
    public static void main(String[] args){

        System.out.print(rev2(123456));


    }

}
