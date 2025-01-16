package main.Ejercicio_02_invert;

import main.Materia.Models.Node;


public class InvertBinaryTree {

    public static Node invertirArbol(Node root) {
        if (root == null) {
            return null;
        }

        Node temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

        invertirArbol(root.getLeft());
        invertirArbol(root.getRight());

        return root;
    }

    public static void printTreeByLevels(Node root) {
        if (root == null) {
            System.out.println("El árbol está vacío.");
            return;
        }

        int altura = altura(root);
        int ancho = (int) Math.pow(2, altura) - 1; 

        String[][] matriz = new String[altura][ancho];


        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz[i][j] = " ";
            }
        }

        llenarMatriz(root, 0, 0, ancho - 1, matriz);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    private static int altura(Node nodo) {
        if (nodo == null) {
            return 0;
        }

        int alturaIzquierda = altura(nodo.getLeft());
        int alturaDerecha = altura(nodo.getRight());

        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

    private static void llenarMatriz(Node nodo, int nivel, int inicio, int fin, String[][] matriz) {
        if (nodo == null) {
            return;
        }

        int medio = (inicio + fin) / 2;

        matriz[nivel][medio] = String.valueOf(nodo.getValue());

        llenarMatriz(nodo.getLeft(), nivel + 1, inicio, medio - 1, matriz);
        llenarMatriz(nodo.getRight(), nivel + 1, medio + 1, fin, matriz);
    }
}
