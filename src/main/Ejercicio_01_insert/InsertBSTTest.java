package main.Ejercicio_01_insert;

import main.Materia.Models.Node;
import main.Materia.Controllers.ArbolBinario;

public class InsertBSTTest {
    private ArbolBinario arbol;

    public InsertBSTTest() {
        this.arbol = new ArbolBinario();
    }

    public void insertar(int valor) {
        arbol.insert(valor);
    }

    public void imprimirPorNiveles() {
        int altura = altura(arbol.getRoot());

        int ancho = (int) Math.pow(2, altura) - 1;

        String[][] matriz = new String[altura][ancho];

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz[i][j] = " ";
            }
        }

 
        llenarMatriz(arbol.getRoot(), 0, 0, ancho - 1, matriz);

        // Imprimimos la matriz
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }


    private void llenarMatriz(Node nodo, int nivel, int inicio, int fin, String[][] matriz) {
        if (nodo == null) {
            return;
        }

  
        int medio = (inicio + fin) / 2;

 
        matriz[nivel][medio] = String.valueOf(nodo.getValue());

        llenarMatriz(nodo.getLeft(), nivel + 1, inicio, medio - 1, matriz);
        llenarMatriz(nodo.getRight(), nivel + 1, medio + 1, fin, matriz);
    }


    private int altura(Node nodo) {
        if (nodo == null) {
            return 0;
        }

        int alturaIzquierda = altura(nodo.getLeft());
        int alturaDerecha = altura(nodo.getRight());

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

    public static void main(String[] args) {
        InsertBSTTest arbol = new InsertBSTTest();

        int[] valores = {5, 3, 7, 2, 4, 6, 8};

        System.out.println("Input: [5, 3, 7, 2, 4, 6, 8]");

        for (int valor : valores) {
            arbol.insertar(valor);
        }

        System.out.println("\nOutput:");
        arbol.imprimirPorNiveles();
    }
}

