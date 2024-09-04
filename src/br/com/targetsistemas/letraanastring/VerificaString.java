package br.com.targetsistemas.letraanastring;

import java.util.Scanner;

public class VerificaString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String minuscula = palavra.toLowerCase();

        int contador = 0;

        for (char x : minuscula.toCharArray()) {
            if (x == 'a') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("Quantidade de vezes que a letra 'a' aparece na string: " + contador);
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }
    }

