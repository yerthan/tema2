import java.util.Scanner;

public class cadena11 {
    public static void main(String[] args) {
        String cadenaEjemplo = "Hola tú!";
        
        //Leo el caracter
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 0 al 9");

        char digitoLeido = sc.nextLine().charAt(0);
        sc.close();

        //Comprobacion
        boolean esDigito = Character.isDigit(digitoLeido);

        int longitudCadenaEjemplo = cadenaEjemplo.length();

        //Convertimo el caracter  que es digito a su valor en entero

        int digitoLeido_Int = Character.getNumericValue(digitoLeido);

        boolean estaDentro = longitudCadenaEjemplo - 1 > digitoLeido_Int;

        //leer caracter de la cadena

        //char caracterLeido = cadenaEjemplo.charAt(digitoLeido_Int);

        char caracterleido = ((esDigito && estaDentro) ? cadenaEjemplo.charAt(digitoLeido_Int) : ' ');

        //Veo si es un espacio

        boolean esEspacio = Character.isSpaceChar(caracterleido);

        String resultadoFinal = (!esEspacio) ? caracterleido + " " : "ESPACIO";

        //muestro el caracter de la posicion leida

        System.out.println((esDigito && estaDentro) ? "El caracter es " + resultadoFinal : "ERROR");



    }
    
}
