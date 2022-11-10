import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String texto = "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";
        System.out.println("¿Quién estaba en la casa de juan?");
        String nombre = sc.nextLine();
        String nombreMinuscula = nombre.toLowerCase();
        String cadenaMinuscula = texto.toLowerCase();

        boolean busqueda = (cadenaMinuscula.indexOf(nombreMinuscula) >= 0 );

        System.out.println((busqueda) ? "Esta en casa de Juan" : "No está en casa de juan");


    }
    
}
