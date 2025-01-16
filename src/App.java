import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;

public class App {
    public static void main(String[] args) throws Exception {

        //runArbolBinario();
        //runEjercicio3();
        //runArbolAvl();
        //runEjercicio1();
        //runEjercicio2();
        runEjercicio4();
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
    private static void runArbolAvl(){
        ArbolAVL arbolAVL = new ArbolAVL();
        int[] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};
        for (int i = 0; i < values.length; i++) {
            arbolAVL.insert(values[i]);
            arbolAVL.printTree();
        }

    }
    private static void runEjercicio1() {

        InsertBSTTest runBST = new InsertBSTTest();
        int[] nuevosValores = {50, 25, 75, 10, 40, 60, 90, 5, 15, 35};

        for (int i = 0; i < nuevosValores.length; i++) {
            runBST.insertar(nuevosValores[i]);
        }

        System.out.println("\n Árbol Binario por niveles:");
        runBST.imprimirPorNiveles();
    }
    private static void runEjercicio2() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
    
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
    
        System.out.println("Árbol original:");
        InvertBinaryTree.printTreeByLevels(arbolBinario.getRoot());

        InvertBinaryTree.invertirArbol(arbolBinario.getRoot());
    
        System.out.println("\nÁrbol invertido:");
        InvertBinaryTree.printTreeByLevels(arbolBinario.getRoot());
    }
    public static void runEjercicio4() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40, 20, 60, 10, 30, 50, 70, 5, 15, 55};
    
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
    
        System.out.println("Estructura del árbol:");
        InsertBSTTest arbolImpresion = new InsertBSTTest(); 
        for (int valor : valores) {
            arbolImpresion.insertar(valor);
        }
        arbolImpresion.imprimirPorNiveles();
    
        Depth depth = new Depth();
    
        int profundidadMaxima = depth.calcularProfundidad(arbolBinario.getRoot());
    
        System.out.println("\nLa profundidad máxima del árbol es: " + profundidadMaxima);
    }
}
