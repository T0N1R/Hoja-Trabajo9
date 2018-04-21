
package HT9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Scanner;


/**
 *
 * @author Esteban
 * @author Antonio
 */
public class Main {
    public static void main(String [] args) throws FileNotFoundException, IOException{
        
        Factory factory = new Factory();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Desea utilizar Stack o Lista? ");
        System.out.println("1. ArrayList");
        System.out.println("2. StackVector");
        System.out.println("3. Lista");
        int opcion1 = scan.nextInt();
        String opcion2 = null;
        
        arbol tree;
        tree = factory.opcionRealizada(opcion1);
        
        
        File words = new File("C:\\Users\\Antonio\\Desktop\\Lab-7-antonio\\Hoja_6_Arboles\\src\\HT9\\palabras");
        FileReader read = new FileReader(words);
        BufferedReader buff = new BufferedReader(read);
        
        String line;
        int contadorYLlave = 0;
        
        while((line = buff.readLine()) != null){
            String[] separate = line.split(",");
            String word_english = separate[0];
            String word_spanish = separate[1];
            arbol.insertNode(word_english.hashCode(), word_english, word_spanish);
            System.out.println(word_english + " " + word_spanish);
            
        }
        File sentence = new File("C:\\Users\\Antonio\\Desktop\\Lab-7-antonio\\Hoja_6_Arboles\\src\\HT9\\oraciones");
        FileReader readSentence = new FileReader(sentence);
        BufferedReader buffSentence = new BufferedReader(readSentence);
        
        String linea;
        String variable;
        while((linea = buffSentence.readLine()) != null){
            //allWords[cont] = linea.split(" ");
            String[] allWords = linea.split(" ");
            for (int i = 0; i < allWords.length; i++){
                variable = allWords[i];
                System.out.print(arbol.find(variable, variable.hashCode()));
                
            }
            
        }
        
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        
        /*
        System.out.println("house".hashCode());
        System.out.println("homework".hashCode());
        System.out.println("town".hashCode());
        System.out.println("yes".hashCode());
        */
    }
    
}
