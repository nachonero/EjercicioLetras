public class Letras1 {
    
    public static void main(String[] args) {
        
        char [] letras= new char[8];
        
        letras[0]='i';
        letras[1]='g';
        letras[2]='n';
        letras[3]='a';
        letras[4]='c';
        letras[5]='i';
        letras[6]='o';
        
       /*char [] letras={'i','g','n','a','c','i','o'};
        --Segunda opción probada y funcionando para realizar la declaración y dar valor al array
        */
        
        
        for(int i=0; i<letras.length; i++) {
            
            System.out.println("la letra de mi nombre en la celda " +i+ " es " +letras[i]);
        }
        
        
                
    }
}
