package Maths;

public class NumberOfDigits {
    public static void main(String []args){
        int n=6;
        int base=2;
        int digit=(int)(Math.log(n)/Math.log(base))+1;
        System.out.println(digit);
    }
}
