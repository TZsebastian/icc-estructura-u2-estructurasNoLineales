package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public int calcularProfundidad(Node root) {
        if (root == null) {
            return 0;
        }

        int profundidadIzquierda = calcularProfundidad(root.getLeft());
        int profundidadDerecha = calcularProfundidad(root.getRight());

        return Math.max(profundidadIzquierda, profundidadDerecha) + 1;
    }
}
