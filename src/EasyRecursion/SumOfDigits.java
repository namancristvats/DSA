package EasyRecursion;

public class SumOfDigits {
    //one way takes outside variable that do not change with function
    static int sum=0;
    public static void main(String[] args){
        int n=1223;
        System.out.print(productOfDigit(n));
    }
    public static int sumOfDigit(int n){
        if(n%10==n){
            return n;
        }
        return n%10+sumOfDigit(n/10);
    }
    public static int productOfDigit(int n){
        if(n%10==n){
            return n;
        }
        return n%10*productOfDigit(n/10);
    }
}
