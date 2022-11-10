import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un texto");
        String texto = sc.nextLine();
        System.out.println("Dime una posicion");
        int posicion = sc.nextInt();


        String parteIzquierda = texto.substring(0, posicion);
        String parteDerecha = texto.substring(posicion);
        System.out.println("La parte de la izquierda es " + parteIzquierda);
        System.out.println( "La posicion de la derecha es " + parteDerecha);
        sc.close();
        


    }
    
}
