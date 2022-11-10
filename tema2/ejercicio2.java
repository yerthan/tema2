import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un texto");
        String texto= sc.nextLine();
        System.out.println("Dime un numero");
        int numero= sc.nextInt();

        int indice= numero;

        //comprobamos que es correcta la posicion
        boolean posicionValida = numero < texto.length();
        char posicionLetra= ((posicionValida) ? texto.charAt(numero) : ' ');
        //System.out.println("En la posicion " + numero + " esta el caracter " + posicionLetra);
        System.out.println((posicionValida) ? "En la posicion " + numero + "esta en la posicion " + posicionLetra : "Posicion no valida");
    }   
}
