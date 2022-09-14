package aula_07_vetores;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        // String[] letras = {"A", "B", "C", "D", "E"};
        
        // for (int i = 0; i < letras.length; i++) {
        //     System.out.println(letras[i]);
        // }
        // System.out.println(Arrays.toString(letras));

        int[] numeros = {9, 10, 12, 25, 2};
        int maior, menor, media;
        maior = numeros[0];
        menor = numeros[0];
        media = 0;


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }
        media /= numeros.length;

        System.out.println(Arrays.toString(numeros));
        System.out.println("Maior = " + maior + 
        "\nMenor = " + menor + 
        "\nMédia = " + media);
    }
}
