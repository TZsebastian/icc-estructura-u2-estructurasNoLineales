import main.Ejercicio_03_listLevels.ListLevels;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;

public class App {
    public static void main(String[] args) throws Exception {

        //runArbolBinario();
        runEjercicio3();
            }

        public static void runArbolBinario(){
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15,55};

        //ingresar cada valor al arbol

        for (int i = 0; i < valores.length; i++) {
            arbolBinario.insert(valores[i]);
        }
        arbolBinario.printTree();
        ArbolRecorridos arbolRecorridos = new ArbolRecorridos();

        System.out.println("Recorrido");
        arbolRecorridos.preOrderIterativo(arbolBinario.getRoot());

        System.out.println("\nRecorrido Recursivo preOrder");
        arbolRecorridos.preOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nRecorrido Recursivo posOrder");
        arbolRecorridos.posOrderRecursivo(arbolBinario.getRoot());

        System.out.println("\nRecorrido Recursivo inOrder");
        arbolRecorridos.inOrderRecursivo(arbolBinario.getRoot());
    }

    private static void runEjercicio3() {
        ArbolBinario arbolBinario = new ArbolBinario();
        ListLevels levels = new ListLevels();
    
        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        for (int i = 0; i < valores.length; i++) {
            arbolBinario.insert(valores[i]);
        }

        System.out.println("Input");
        arbolBinario.printTree();
    
        System.out.println("output");
        levels.printLevels(arbolBinario.getRoot());
    }
}
