import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime un caracter");
    char caracter = sc.nextLine().charAt(0);
    
    sc.close();

    int caracterInt = Integer.valueOf(caracter);

    System.out.println("Con Integer.valueOf = " + caracterInt);

    int caracterInt2 = (int)caracter;
    System.out.println("Con (int)caracter = " + caracterInt);
    boolean esDigito = (caracter >= 48 && caracter <= 57 );
    boolean esMayuscula = (caracter >= 65 && caracter <=90);
    boolean esPacio = (caracter == 32);

    System.out.println("Es un digito ? " + esDigito);
    System.out.println("Es mayuscula " + esMayuscula);
    System.out.println("Hay un espacio " + esPacio);
    }
    
}
