
public class Letras4 {
       
    
    public static void main(String[] args) {
        
        char [] name= new char[8]; //Creación de "Array name" con las letras de mi nombre
        
        name[0]='I';
        name[1]='g';
        name[2]='n';
        name[3]='a';
        name[4]='c';
        name[5]='i';
        name[6]='o';
        
        char [] surname= new char [4]; //creación de "Array surname" con las letras de mi apellido
        
        surname[0]='N';
        surname[1]='e';
        surname[2]='i';
        surname[3]='s';
        
        char [] empty = new char [1]; //creación de un Array (char) para tener un caracter en blanco entre el nombre y el apellido
        
        empty[0]=' ';
        
        
        char [] name_surname = new char[name.length+surname.length+empty.length]; // Creación del nuevo array dónde aparecerá name+empty+surname
        
        System.arraycopy(name, 0, name_surname, 0, name.length); //introducción de los Arrays orginales en el nuevo Array solicitado mediante el método arraycopy
        
        System.arraycopy(empty, 0, name_surname, name.length, empty.length); // Idem anterior
        
        System.arraycopy(surname, 0, name_surname, name.length+empty.length, surname.length); // Idem anterior
            
        System.out.print("NAME + SURNAME = ");
        
            for(int i=0; i<name_surname.length; i++) { // Creación del buble para que recorra el Array previo a la impresión
        
                System.out.print(name_surname[i]); //impresión de todos los caracteres del ejercicio unificacdos en un Array
    }       }
    
        
    
    
}