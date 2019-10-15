package com.rogerio;

public class Binary {

    public static void main(String args[]){
        System.out.println(toDecimal("1111"));
    }

    public static String toBinary(int value){
        String aux = "";
        if(value > 1){
            aux += value % 2;
            return aux += toBinary(value/2);
        }else{
            aux += value;
            return new StringBuilder(aux).reverse().toString();
        }
    }

    public static int toDecimal(String binary){
        String[] aux = binary.split("");
        int value =  Integer.parseInt(aux[0]);
        if (value == 1 || value == 0){
            if (aux.length > 1){

                value = (int) (value * Math.pow(2, aux.length -1));
                return value + toDecimal(binary.substring(1,aux.length));
            }else{
                return value;
            }
        }else{
            return Integer.MIN_VALUE;
        }
    }
}
