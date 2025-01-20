package main.Materia.Controllers;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import main.Materia.Models.NodeG;

public class Graph {
    private List<NodeG> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeG addNode(int value) {
        NodeG nodeG = new NodeG(value);
        nodes.add(nodeG);
        return nodeG;
    }

    public void addEdge(NodeG src, NodeG dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src); 
    }

    public void addEdgeUnited(NodeG src, NodeG dest){
        src.addNeighbor(dest);
    }

    public void printGraph() {
        for (NodeG nodeG : nodes) {
            System.out.print("Vertice " + nodeG.getValue() + ": ");
            for (NodeG neighbor : nodeG.getNeighbors()) {
                System.out.print(neighbor.getValue() + " - ");
            }
            System.out.println();
        }
    }

    public void getDFS(NodeG start) {
        Set<NodeG> visitados = new HashSet<>();
        System.out.println("DFS desde el node " + start.getValue() + " :");
        getDFSUtil(start,visitados);
        System.out.println();
    }

    private void getDFSUtil(NodeG node, Set<NodeG> visitados){
        if (visitados.contains(node)){
            return;
        }

        System.out.print(node.getValue() + " ");
        visitados.add(node);

        for (NodeG neighbor : node.getNeighbors()){
            getDFSUtil(neighbor, visitados);
        }
    }

    public boolean getDFS2(NodeG start, NodeG destino){
        Set<NodeG> visitados = new HashSet<>();
        System.out.println("DFS desde el node " + start.getValue() + " :");
        boolean encontrado = getDFSUtil2(start, destino, visitados);
        System.out.println();
        return encontrado;
    }

    private boolean getDFSUtil2(NodeG node, NodeG destino, Set<NodeG> visitados){
        if (visitados.contains(node)){
            return false;
        }

        System.out.print(node.getValue() + " ");
        visitados.add(node);

        if(node.equals(destino)){
            return true;
        }

        for (NodeG neighbor : node.getNeighbors()){
            if (getDFSUtil2(neighbor,destino, visitados)){
                return true;
            }
        }
        return false;
    }

    public void getBFS(NodeG start) {
        Set<NodeG> visitados = new HashSet<>();
        Queue<NodeG> cola = new LinkedList<>();

        System.out.println("BFS desde el nodo " + start.getValue());
        cola.add(start);
        visitados.add(start);

        while (!cola.isEmpty()){
            NodeG actual = cola.poll();
            System.out.print
            (actual.getValue() + " ");

            for (NodeG neighbor : actual.getNeighbors()){
                if(!visitados.contains(neighbor)){
                    visitados.add(neighbor);
                    cola.add(neighbor);
                }
            }
        }
    }

    public int[][] getAdjacencyMatrix() {
            return null;
 
    }

    public void printAdjacencyMatrix() {
    }
}