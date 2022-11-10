import java.util.Scanner;

import javax.security.auth.callback.TextOutputCallback;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime quien más estaba en la casa de Juan");
        String niño = sc.nextLine();
        String cadena = "“En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";

        int posicionInsercion = cadena.indexOf(" y ");

        //1 forma con Stringbuffer

        StringBuffer sBuffer = new StringBuffer(cadena);
        sBuffer.insert(posicionInsercion , ", " + niño );

        System.out.println("es : " + sBuffer );

        //2 forma subString

        String parteIzquierda = cadena.substring(0, posicionInsercion);
        String parteDerecha = cadena.substring(posicionInsercion);

        String parteCentral = " , " + niño;
        String nuevaCadena = parteIzquierda + parteCentral + parteDerecha; 
        System.out.println( parteIzquierda + parteCentral + parteDerecha);





    }
    
}
