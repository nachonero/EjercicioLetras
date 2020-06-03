import java.util.*;

        
public class Letras2 {
    
    public static void main(String[] args) {
        
        ArrayList<Character> letras_nombre = new ArrayList<Character>();
        
        letras_nombre.add('i');
        letras_nombre.add('g');
        letras_nombre.add('n');
        letras_nombre.add('a');
        letras_nombre.add('c');
        letras_nombre.add('i');
        letras_nombre.add('o');
        //letras_nombre.add('7');  - Prueba de dígito para else. Funciona correctamente.
      
        
        //char [] letras_vocales={'a','e','i','o','u'};
        char a='a';
        char e='e';
        char i='i';
        char o='o';
        char u='u';
        
        for (int x=0;x<letras_nombre.size();x++)  {
            System.out.println((char)letras_nombre.get(x));
            
        char l=(char)letras_nombre.get(x);
            
            if (l==a || l==e || l==i || l==u || l==o){    
                
                System.out.println("VOCAL");
            }
            
            else if  (Character.isDigit(l)) {
            
                System.out.println("Los nombres no llevan numeros!");
            }
            else  {
                    System.out.println("CONSONANTE");
                    }
                    
            
            
            }
           
        }
            
                
    }
        
        
        
        
    
  