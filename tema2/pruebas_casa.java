import javax.print.attribute.SetOfIntegerSyntax;

public class pruebas_casa {
public static void main(String[] args) {
    String texto = "Hola";
    //int indice = 3;
    //char caracter = texto.charAt(indice);
  //  System.out.println("El caracter es " + caracter);


    //comparacion
    String cadena1= "Hola";
    String cadena2= "HolA";

//    System.out.println((cadena1 == cadena2) ? "Iguales" : "Distintas");

    //comparacion con CompareTo

    //System.out.println((cadena1.compareTo(cadena2) == 0) ? "Iguales" : "Distintas");

    System.out.println((cadena1.compareToIgnoreCase(cadena2) == 0) ? "Iguales" : "Distintas");


    String apellido1= "alfonso";
    String apellido2 = "alonso";

    //System.out.println((apellido1.compareTo(apellido2) < 0 ) ? apellido1 + "va antes que " + apellido2 : apellido1 + "va despues que " + apellido2);
    
    String cadena = "jose";
    int longitud = cadena.length();
    System.out.println("La longitud del texto es de " + longitud);

    char primero= cadena.charAt(0);
    char ultimo= cadena.charAt(longitud -1);
    System.out.println("EL primer caracter es " + primero);
    System.out.println("el ultimo caracter es " + ultimo);

    //Buscamos caracter

    char letraO= 'o';
    int posicionO= cadena.indexOf(letraO);
    System.out.println("La posicion de la letra o esta en " + posicionO);

    //Buscar caracter + el siguiente

    String quijote = "En un lugar de la mancha vivia don manuel";

    char letraA = 'a';
    int posicionA= quijote.indexOf(letraA);
    int posicionAA= quijote.indexOf(letraA, posicionA+1);

    int posicionAAA= quijote.indexOf(letraA, posicionAA + 1);
    System.out.println("la primera a está en " + posicionA + "la segunda a está en " + posicionAA +" y la tercera en " + posicionAAA);
        
   //convertir a minuscula y mayuscula

   //String cadenaMinuscula = quijote.toUpperCase();
   String cadenaMayuscula = quijote.toLowerCase();

   String lugar = "mancha";
   String lugarMinuscula = lugar.toLowerCase();
   String lugarMayuscula = cadena.toUpperCase();
   int posicionLugar = cadenaMayuscula.indexOf(lugarMinuscula);
   System.out.println((posicionLugar >= 0) ? lugar + " SI " : lugar + " NO ");


   //Reemplazar
   String cadenaModificada= quijote.replace('a', 'X');
   System.out.println(cadenaModificada);

   String cadenaModificada2= quijote.replaceAll("un", "otro");
   System.out.println(cadenaModificada2);

   String cadenaModificada3 = quijote.replaceFirst("a", "X");
   System.out.println(cadenaModificada3);

   String cadenaModificada4 = cadenaModificada.replaceAll("e", "X");
   System.out.println(cadenaModificada4);

  //Eliminar espacios delante y detras

   String saludo= "         hola y adios    ";
   System.out.println("-"+saludo+"-");
   System.out.println("-"+saludo.trim()+"-");

   //Cortar

   String trozos =cadena.split(' ');
   int cantidadDeTrozos = trozos.length();
   System.out.println("Partiendo la cadena desde \"de\" me salen" + cantidadDeTrozos );
   String trozo0 = trozos[0];
   String trozo1 = trozos[1];
   System.out.println("El trozo 0 es : " trozo0);
   System.out.println("El trozo 1 es : " + trozo1);


    }

        
}


