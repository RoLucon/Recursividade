package com.rogerio;

public class Vectors {

    public static int sum(int[] array){
        return sum(array, array.length - 1);
    }

    public static int sum(int[] array, int len){
        if (len > 0){
            return array[len] + sum(array, len -1);
        }else {
            return array[len];
        }
    }
}
