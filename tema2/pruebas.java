public class pruebas {
    public static void main(String[] args) {
        String cadena = "En un lugar de la Mancha";
        
        //Charat
        int indice = 8;
        char caracter = cadena.charAt(indice);
        System.out.println(caracter);

        //comparacion
        String cadena1 ="Hola";
        String cadena2 = "HolA";

        System.out.println((cadena1 == cadena2) ? "IGUALES" : "Distintas" );
        System.out.println((cadena1 == "Hola") ? "Iguales" : "Distintas");
        System.out.println((cadena1.compareTo(cadena2)== 0) ? "Iguales" : "Distintas");
      //  System.out.println(cadena1.compareTo(cadena2));
        System.out.println("Ignore Case : "  + ((cadena1.compareToIgnoreCase(cadena2) ==0) ? "Iguales"  : "Distintas"));

    }
    
}
