/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT9;

/**
 * 
 * @author Esteban
 * @author Antonio
 */
public class BinaryTree<E>
{
    Node raiz; //raiz del arbol
    
    public BinaryTree(){
        raiz = null;
    }
    
    
    public void insertNode(int id, String ingles, String espanol){
        Node newNode = new Node(id, ingles, espanol);
        if (raiz == null) //en el casode que la razi no posea 
        {
            
            raiz = newNode;
            
        }else{
            Node focusNode = raiz;
            
            Node parent;
            
            while(true){
                
                parent = focusNode;
                
                if(id < focusNode.id)//si el numero es menor al focusNode (que simboliza una raiz), se cambia el enfoque al lado izquierdo
                {
                    focusNode = focusNode.left;
                    
                    if(focusNode == null)//si el valor que regresa es null, significa que este nodo aun no existe. es un lugar donde puede colocarse el nuevo nodo
                    {
                        parent.left = newNode; //se establece el nodo.
                        return ;//finaliza la ejecucion
                    }
                    
                } else  // en el caso de que el numero sea mayor a FocusNode (raiz), se cambia el enfoque al lado derecho.
                {
                    focusNode = focusNode.right;
                    
                    if(focusNode == null)// si el valor que regresa es nul, significa que este nodo aun no exite. Es un lugar donde puede colocarse el nuevo nodo.
                    {
                        parent.right = newNode;
                        return; //finaliza la ejecucion
                    }
                }
            }
        }
    }
    
    /**
     * Este metodo se utiliza para poder encontrar la palabra del texto en el diccionario, para ello se utiliza el dato id e ingles.
     * el id es el hashCode de la palabra ingles, este se buscará en el árbol, si se encuentra, se va a regresar la palabra spanish que
     * se encuentra en ese nodo, de lo contrario, se va a regresar la palabra ingles entre asteriscos
     * @param id
     * @return traduccion
     */
    public String find(String ingles, int id)
    {
        Node focusNode = raiz;
        
        //mientras que no se encuentre el nodo con id igual al parametro, se bajará a los hijos de izquierda o derecha del arbol
        //cuando lleguen hasta el final de árbol, el resultado será null. en caso de ser null, se regresará el parametro ingles entre asteriscos
        while(focusNode.id != id)
        {
            if(id < focusNode.id)//en el caso de que el id del parametro es menor al nodo, se ira al hijo de la izquierda (va a tener un id menor al padre).
            {
                focusNode = focusNode.left;
            }
            
            if(id > focusNode.id)//en el caso de que el id del parametro es mayor al nodo, se ira al hiijo de la derecha (va a tener un id mayor al padre).
            {
                focusNode = focusNode.right;
            }
            
            if(focusNode == null)//si el nodo es null se refiere a que se llegó al final del arbol, por lo que se va a imprimir la palabra en ingles entre *.
            {
                return " * " + ingles + " * ";
            }
        }
        return focusNode.espanol;
            
    }
   
}