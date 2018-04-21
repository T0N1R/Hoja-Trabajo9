
package HT9;
/**
 * 
 * @author Esteban
 * @author Antonio
 */
class Factory<E> {
    
    arbol elegido;

    public Factory(){}

   
    public arbol opcionRealizada(int opcion1){
        switch(opcion1){
            case 1:{
                elegido = new SplayTree<>();
                break;
            }
            
            case 2:{
                elegido = new RedBlackTree<>();
                break;
            }
            
            default:{
                System.out.println("Esta opcion no es valida");
                break;
            }
        }
        
        return elegido;
    }
}
