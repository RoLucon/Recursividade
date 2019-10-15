package com.rogerio;

public class BinarySearch {

    public static int search(int value, int[]array){
        return search(value, array, array.length -1, 0);
    }

    public static int search(int value, int[]array, int maior, int menor){
        int media = (maior - menor) / 2;

        if(maior < menor){
            return -1;
        }else if(array[media] == value){
            return media;
        }else if(value < array[media]){
            return search(value, array, media -1, 0);
        }else{
            return search(value, array, media + 1, array.length);
        }
    }


}
