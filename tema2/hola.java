public class hola {
    public static void main(String[] args) {
       String cadena = "en un lugar de la Mancha" ;

        //CharAt
        int indice = 1;
        char caracter = cadena.charAt(indice);
        System.out.println(caracter);

        //comparacion
        String cadena1 = "Hola";
        String cadena2 = "HolA";

        System.out.println((cadena1 == cadena2) ? "Iguales" : "Distintas");
        System.out.println((cadena1 == "hola") ? "Iguales" : "Distintas");

        System.out.println(cadena1.compareTo(cadena2));

        //0 significa igual  y si da otro numero es falso 

        System.out.println((cadena1.compareTo(cadena2) == 0) ? "iguales" : "Distintas");

        //compareToIgnore Para ignorar mayusculas
        System.out.println("Ignore case" + ((cadena1.compareToIgnoreCase(cadena2)==0) ? "Iguales" : "Distintos"));

        String apellido1 = "alfonso";
        String apellido2 = "alonso";


        //Esto deberia de hacer una resta de los caracteres en la tabla ASCII --> L - G =x, o - a = y ...
        System.out.println((apellido1.compareTo(apellido2) > 0) ? apellido1 + "va antes que " + apellido2 : apellido2 +"va antes que " + apellido1);

        //longitud de una cadena cuenta el numero de letras que tiene la palabra 
        int longitud = cadena.length();
        System.out.println("La cadena tiene una longitud de " + cadena);

        //puedo sacar el ultimo caracter
        char ultimo = cadena.charAt(longitud - 1 );

        //buscar una cadena
        char letraD = 'd';
        int posicionD=cadena.indexOf('d');
        cadena.indexOf("La letra D esta en la posición" + posicionD);

        char letraA= 'a';
        int posicionA = cadena.indexOf(letraA);
        int posicionAA= cadena.indexOf(letraA, posicionA+1);


        //Esto sirve para decir que me busque otra más, con lo cual desde la última A buscame desde ahí otra A
        System.out.println("La letra a está en: " + posicionA + posicionAA);
        String lugar = "Mancha";
        int posicionLugar = cadena.indexOf(lugar);
        System.out.println((posicionLugar >= 0) ? lugar + "Si está en la cadena" : " No está en la cadena");

        System.out.println("La letra a está en: " + posicionA + posicionAA);
        int posicionLugarA = cadena.indexOf(letraA, posicionA+1);
        System.out.println("La primera A esta en " + posicionA + "la segunda a está en " + posicionAA );

        //Convertir cadenas a mayusculas a minusculas
        //String cadenaMinuscula = cadena.toLowerCase();
        //String cadenaMayuscula = cadena.toUpperCase();
        
        String lugarMinuscula = lugar.toLowerCase();
        String lugarMayuscula = lugar.toUpperCase();
        posicionLugar = lugarMayuscula.indexOf(lugarMinuscula);
        System.out.println(( posicionLugar >= 0) ? lugar + "SI" : lugar + "NO");
        

        //Reemplazar
        String cadenaModificada =cadena.replace( 'a', 'X');
        System.out.println(cadenaModificada);

        cadenaModificada = cadena.replaceAll("un", "otro");
        System.out.println(cadenaModificada);

        //tienes que poner comillas dobles en replaceFirst

        cadenaModificada =cadena.replaceFirst( "a", "X");
        cadenaModificada = cadenaModificada.replaceAll("e", "X");
        System.out.println(cadenaModificada);

        //Eliminar los espacios delante y detras

        String saludo= "           hola y adios       ";
        System.out.println("-"+saludo+"-");
        saludo.trim();
        System.out.println(saludo.trim());


        //Cortar una cadena

        String[] trozos = cadena.split("de");
        int cantidadDeTrozos = trozos.length;
        System.out.println("Partimos la cadena \"de\" me salen " + cantidadDeTrozos + " trozos");

        String trozo0 = trozos[0];
        String trozo1 = trozos[1];
        System.out.println("El trozo 0 es : " + trozo0);
        System.out.println("El trozo 1 es : " + trozo1);
        

        //Cortar cadena SubString
        String cadenaDesde5 = cadena.substring(5)        ;
        System.out.println(cadenaDesde5);

        String cadenaDesde5Hasta20=cadena.substring(5 , 20);
        System.out.println(cadenaDesde5Hasta20);


        //concatener
        String saludo1 = "Hola";
        String saludo2 = "Pepe";

        String saludoCompleto = saludo1 + saludo2;
        System.out.println(saludoCompleto);
        System.out.println(saludo1.concat(saludo2));

        float pi = 3.1416f;
        String PI = String.valueOf(pi);
        System.out.println(PI);

        //StringBuffer

        StringBuffer sBuffer= new StringBuffer(cadena);
        sBuffer.setCharAt(1,  'M');
        System.out.println(sBuffer);
        System.out.println(sBuffer);

        //Inserta en una posicion
        sBuffer.insert(10, "DON QUIJOTE");
        System.out.println(sBuffer);


        //saber si caracter es de un tipo o de otro

        boolean esDigito = Character.isDigit(3);
        Character.isSpaceChar(' ');
        boolean esMayuscula = Character.isUpperCase('V');

        }
    
}
