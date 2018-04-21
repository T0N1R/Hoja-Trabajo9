package HT9;

/**
 * 
 * @author Esteban
 * @author Antonio
 */
public class Node {
    int id;
    String ingles;
    String espanol;
    Node right; // nodo hijo derecho
    Node left; //nodo hijo izquierdo
    
    Node(int id, String ingles, String espanol){
        this.id = id;
        this.ingles = ingles;
        this.espanol = espanol;
    }
    
    // método para mostrar la coleccion de palabras, se mostrarán en orden de acuerdo al recorrido in-order
    public String toString(){
        return ingles + ", " + espanol;
    }
}
