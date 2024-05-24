package org.example;

public class PowerXN {

    public static void main(String[] args) {


//        System.out.println(pow(0.44894,-5));
//        System.out.println(myPow(0.00001,2147483647));


    }
    public static double myPow(double x, int n) {
        if (x == 0 )
            return 0;
        return n>=0? helper(x, n):helper(x, -n);


    }

    public static double helper(double x, long n)
    {
        if(n==0)
            return 1;
        double y = helper(x, n/2);
        return n%2==0  ?y*y : y*y*x;
    }




}
