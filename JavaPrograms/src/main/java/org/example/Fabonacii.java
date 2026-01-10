package org.example;

public class Fabonacii {

    public static int fabonacii(int n){
        if(n < 1) return 1;
        return fabonacii(n-1) + fabonacii(n-2);
    }
}
