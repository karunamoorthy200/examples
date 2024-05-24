package org.example.sample;

public class KthSymbolInGrammer {


    public static void main(String[] args) {
        System.out.println(kthGrammar(3, 4));
    }



    public static int kthGrammar(int n, int k)
    {
        if(k==1)
        {
            return 0;
        }

        return (k%2==0)?kthGrammar(n-1, k/2)==0?1:0:
                kthGrammar(n-1, (k/2)+1);
    }




    public static int inverse(int val)
    {
        return val==0?1:0;

    }
}
