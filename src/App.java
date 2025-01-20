import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLevels.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolAVL;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorridos;
import main.Materia.Controllers.Graph;
import main.Materia.Models.NodeG;

public class App {
    public static void main(String[] args) throws Exception {

        //runArbolBinario();
        //runEjercicio3();
        //runArbolAvl();
        //runEjercicio1();
        //runEjercicio2();
        //runEjercicio4();
        //runGraph();
        runGraphEjercicio();
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

    public static void runEjercicio3() {
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
    public static void runArbolAvl(){
        ArbolAVL arbolAVL = new ArbolAVL();
        int[] values = {10, 20, 15, 24, 9, 8, 21, 23, 50, 25};
        for (int i = 0; i < values.length; i++) {
            arbolAVL.insert(values[i]);
            arbolAVL.printTree();
        }

    }
    public static void runEjercicio1() {

        InsertBSTTest runBST = new InsertBSTTest();
        int[] nuevosValores = {50, 25, 75, 10, 40, 60, 90, 5, 15, 35};

        for (int i = 0; i < nuevosValores.length; i++) {
            runBST.insertar(nuevosValores[i]);
        }

        System.out.println("\n Árbol Binario por niveles:");
        runBST.imprimirPorNiveles();
    }
    public static void runEjercicio2() {
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

    public static void runGraph(){
        Graph graph = new Graph();
        Graph graph2 = new Graph();
        
        /* 
        NodeG node1 = graph.addNode(5);
        NodeG node2 = graph.addNode(7);
        NodeG node3 = graph.addNode(9);
        NodeG node4 = graph.addNode(11);
        NodeG node5 = graph.addNode(3);

        graph.addEdge(node1, node2);
        graph.addEdge(node1, node3);
        graph.addEdge(node1, node5);
        graph.addEdge(node2, node3);
        graph.addEdge(node3, node5);
        graph.addEdge(node4, node5);
        */
        
        
        NodeG node0 = graph.addNode(0);
        NodeG node1 = graph.addNode(1);
        NodeG node2 = graph.addNode(2);
        NodeG node3 = graph.addNode(3);
        NodeG node4 = graph.addNode(4);
        NodeG node5 = graph.addNode(5);

        graph.addEdgeUnited(node0, node3);
        graph.addEdgeUnited(node0, node5);
        graph.addEdgeUnited(node3, node2);
        graph.addEdgeUnited(node3, node4);
        graph.addEdgeUnited(node2, node1);
        graph.addEdgeUnited(node4, node1);
        graph.addEdgeUnited(node1,node0);

        NodeG nodeg0 = graph2.addNode(0);
        NodeG nodeg1 = graph2.addNode(1);
        NodeG nodeg2 = graph2.addNode(2);
        NodeG nodeg3 = graph2.addNode(3);
        NodeG nodeg4 = graph2.addNode(4);
        NodeG nodeg5 = graph2.addNode(5);

        graph2.addEdge(nodeg0, nodeg3);
        graph2.addEdge(nodeg0, nodeg5);
        graph2.addEdge(nodeg3, nodeg2);
        graph2.addEdge(nodeg3, nodeg4);
        graph2.addEdge(nodeg2, nodeg1);
        graph2.addEdge(nodeg4, nodeg1);
        graph2.addEdge(nodeg1,nodeg0);

        System.out.println("Grafo (Lista de Adyacencia):");
        graph.printGraph();

        graph.getDFS(node0);

        graph.getBFS(node0);

        System.out.println();

        System.out.println("Grafo No direccionado:");

        graph2.getDFS(nodeg0);

        graph2.getBFS(nodeg0);

    }

    public static void runGraphEjercicio(){
        Graph grafo = new Graph();

        NodeG node0 = grafo.addNode(0);
        NodeG node1 = grafo.addNode(1);
        NodeG node2 = grafo.addNode(2);
        NodeG node3 = grafo.addNode(3);
        NodeG node4 = grafo.addNode(4);
        NodeG node5 = grafo.addNode(5);
        NodeG node7 = grafo.addNode(7);
        NodeG node8 = grafo.addNode(8);
        NodeG node9 = grafo.addNode(9);

        grafo.addEdge(node0, node1);
        grafo.addEdge(node0, node3);
        grafo.addEdge(node0, node5);
        grafo.addEdge(node1, node2);
        grafo.addEdge(node1, node4);
        grafo.addEdge(node1, node8);
        grafo.addEdge(node3, node2);
        grafo.addEdge(node3, node4);
        grafo.addEdge(node3, node7);
        grafo.addEdge(node3, node9);
        grafo.addEdge(node7, node8);


        grafo.printGraph();

        System.out.println("Grafo No direccionado:");

        grafo.getDFS(node0);

        System.out.println();

        System.out.println("Grafo desde el nodo0 hasta el nodo7:c");

        grafo.getDFS2(node0, node7);


    }

}
