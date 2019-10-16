package com.rogerio;

public class GCD {

    public static int gCD(int x, int y){
           if (x>= y && x % y ==0){
               return y;
           }else if(x < y){
               return gCD(y,x);
           }else {
               return gCD(y, x % y);
           }
    }
}
