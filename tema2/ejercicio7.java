import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe cualquier letra, digito ...");
        char caracter = sc.nextLine().charAt(0);
        sc.close();
        System.out.println("Es dígito ? " + Character.isDigit(caracter));
        System.out.println("Es un espacio en blanco ? " + Character.isSpaceChar(caracter));
        System.out.println("Es minuscula ? " + Character.isUpperCase(caracter) );
    }
    
}
