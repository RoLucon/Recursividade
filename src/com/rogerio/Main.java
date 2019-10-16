package com.rogerio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //Array para testes
	    int[] arrayRand = {6, 0, 15, 4, 9, 7, 8, 3, 5, 17, 12, 13, 10, 19, 14, 11, 16, 2, 18, 1};
	    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("1 - Converter Decimal para Binario");
        System.out.println("2 - Achar o numero de fibonacci dada uma posiçao");
        System.out.println("3 - Resultado de um numero fatorial(n!)");
        System.out.println("4 - Busca Binaria, retorna a posiçao do elemento");
        System.out.println("5 - Inverte uma palavra");
        System.out.println("6 - Funcao de Ackermann (Dois inteiros)");
        System.out.println("7 - Funcao de Ackermann (Tres inteiros)");
        System.out.println("8 - Maximo Divisor Comum");

        int input = Integer.parseInt(bf.readLine());

        //Chamada com Saida dos metodos
        switch (input){

            case 1:
                System.out.println("Entre o valor decimal a ser convertido: ");
                int dec = Integer.parseInt(bf.readLine());
                System.out.println("Binario: " + Binary.toBinary(dec));
                break;
            case 2:
                System.out.println("Entre o numero Binario a ser convertido: ");
                String bin = bf.readLine();
                int res = Binary.toDecimal(bin);
                System.out.println(res >= 0 ? "Valor em Decimal: " + res : "Valor nao e um Binario");
                break;
            case 3:
                System.out.println("Entre a posiçao de Fibonacci: ");
                int fib = Integer.parseInt(bf.readLine());
                System.out.println("Num representa a posiçao em Fibomacci: " + Fibonacci.fibonacci(fib));
                break;
            case 4:
                System.out.println("Entre ao numero fatorial a ser calculado: ");
                int fac = Integer.parseInt(bf.readLine());
                System.out.println("Fatorial: " + Factorial.factorial(fac));
                break;
            case 5:
                System.out.println("Entre o valor a ser encontrado no array, nuemro entre 1 e 20" +
                        "(retorno -1 = a nao encontrado): ");
                int pos = Integer.parseInt(bf.readLine());
                System.out.println(BinarySearch.search(pos, array));
                break;
            case 6:
                System.out.println("Entre a palavra a ser invertida");
                String text = bf.readLine();
                System.out.println("inverte: " + StringHandle.reverse(text));
                break;
            case 7:
                System.out.println("Entre o primeiro valores para Funcao de Ackermann");
                int m = Integer.parseInt(bf.readLine());
                System.out.println("Entre o segundo valores para Funcao de Ackermann");
                int n = Integer.parseInt(bf.readLine());
                System.out.println("Ackermann: " + Ackermann.ackermann(m, n));
                break;
            case 8:
                System.out.println("Entre o primeiro valores para Funcao de Ackermann");
                m = Integer.parseInt(bf.readLine());
                System.out.println("Entre o segundo valores para Funcao de Ackermann");
                n = Integer.parseInt(bf.readLine());
                System.out.println("Entre o segundo valores para Funcao de Ackermann");
                int p = Integer.parseInt(bf.readLine());
                System.out.println("Ackermann: " + Ackermann.ackermann(m, n, p));
                break;
            case 9:
                System.out.println("Entre o primeiro numero do MDC: ");
                int x = Integer.parseInt(bf.readLine());
                System.out.println("Entre o psegundo numero do MDC: ");
                int y = Integer.parseInt(bf.readLine());
                System.out.println("MDC: " + GCD.gCD(x, y));
                break;
        }
    }
}
