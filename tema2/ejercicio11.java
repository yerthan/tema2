import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        //Leer cadena
        Scanner sc= new Scanner(System.in);
        String cadenaInterna = "0125789634";

        //Leo el caracter
        System.out.println("Dime un dígito del 0 al 9");
        char numero = sc.nextLine().charAt(0);
        boolean isDigit = Character.isDigit(numero);
        int numeroFin = numero;
        boolean noEsGrande = (isDigit && cadenaInterna.length() > (int)(numero));

          


    }
    
}
