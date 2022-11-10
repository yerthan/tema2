import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime un texto");
    String texto = sc.nextLine();

    int longitud = texto.length();
    System.out.println("La cadena tiene " + longitud + " caracteres");


    
    sc.close();
        
    }
    
}
