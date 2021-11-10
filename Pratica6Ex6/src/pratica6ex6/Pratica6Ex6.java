/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica6ex6;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Pratica6Ex6 {

    /*
    6.	A sequência RICCI difere da série de Fibonacci porque os dois primeiros termos são fornecidos pelo 
    usuário. Os demais termos são gerados da mesma forma que a série de Fibonacci. Criar um programa que 
    imprima os n primeiros termos da série de RICCI e a soma dos termos impressos, sabendo-se que para 
    existir esta série serão necessários pelo menos 3 termos.
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       int termo1, termo2, elemento, soma = 0;
        System.out.println("Digité a quantidade de elementos: ");
        elemento = entrada.nextInt();
        int [] serie = new int[elemento];
        System.out.println("Digité o primeiro termo: ");
        termo1 = entrada.nextInt();
        System.out.println("Digité o segundo termo: ");
        termo2 = entrada.nextInt();
        for (int cont = 0; cont < serie.length; cont++) {
            if (cont == 0) {
                serie[cont] = termo1;
                System.out.print(serie[cont] +", ");
            }
            if (cont == 1) {
                serie[cont] = termo2;
                System.out.print(serie[cont] +", ");
            }
            if (cont >= 2) {
                int vAnterior = cont - 1;
                int vAnt = cont - 2;
                serie[cont] = serie[vAnt] + serie[vAnterior];
                if (cont == serie.length - 1) {
                    System.out.println(serie[cont]+".");
                }
                else {
                    System.out.print(serie[cont] +", ");
                }
            }
        }
        for (int cont = 0; cont < serie.length; cont++) {
            soma = soma + serie[cont];
        }
        System.out.println("A soma de todos os termos é: " +soma);
    }
}
