import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un texto");
        String texto = sc.nextLine();
        System.out.println("Dime un caracter");
        char caracterBuscado= sc.nextLine().charAt(0);
        System.out.println("Dime un caracte por el que modificar");
        char cambiarCaracter =sc.nextLine().charAt(0);

        String textoModificado = texto.replace(caracterBuscado, cambiarCaracter);
        System.out.println("ahora el texto es " + textoModificado);
        sc.close();  
    }
    
}
