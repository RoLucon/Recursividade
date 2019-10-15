package com.rogerio;

public class Ackermann {

    public static void main(String args[]){
        System.out.println(ackermann(7,1, 3));
    }

    public static int ackermann(int m, int n){
        if(m == 0){
            return n + 1;
        }else if(n == 0){
            return ackermann(m-1,1);
        }else{
            return ackermann(m-1, ackermann(m, n-1));
        }
    }
    public static int ackermann(int m, int n, int p){
        if(p == 0){
            return m + n;
        }else if(n == 0 && p == 1) {
            return 0;
        }else if(n == 0 && p == 2){
         return  1;
        } else if(n == 0 && p > 2){
            return m;
        }else {
            return ackermann(m, ackermann(m, n-1, p),p-1);
        }

    }


}
