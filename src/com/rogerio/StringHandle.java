package com.rogerio;

public class StringHandle {

    public static String reverse(String text){
        String[] aux = text.split("");
        if (aux.length > 1){
            String letra =  aux[aux.length-1];
            return letra + reverse(text.substring(0,aux.length-1));
        }else{
            return text;
        }
    }
}
