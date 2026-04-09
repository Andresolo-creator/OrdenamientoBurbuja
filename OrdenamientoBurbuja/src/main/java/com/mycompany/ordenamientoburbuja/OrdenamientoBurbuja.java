package com.mycompany.ordenamientoburbuja;
import java.util.Arrays;

public class OrdenamientoBurbuja {

    // Método ordenamiento burbuja optimizado
    public static void burbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                }
            }
            if (!intercambio) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {45, 22, 11, -4, 7, 3};

        System.out.println("Arreglo original: " + Arrays.toString(arr));
        burbuja(arr); 
        System.out.println("Arreglo ordenado: " + Arrays.toString(arr));
    }
}