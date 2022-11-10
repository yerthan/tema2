import javax.annotation.processing.RoundEnvironment;

public class math {
    public static void main(String[] args) {
        
        //absoluto : Los pone en positivo
        float decimal1 = -23.364f;
        float decimal2 = -23.7543f;
        float decimal3 = -23.000026f;

        System.out.println(decimal1 + " : " + Math.abs(decimal1));
        System.out.println(decimal1 + " : " + Math.abs(decimal2));
        System.out.println(decimal1 + " : " + Math.abs(decimal3));

        //Potencia - Pow
        
        double resultado = Math.pow(2, 4);
        System.out.println(resultado);

        System.out.println(Math.pow(150, 5000));
        double resultadoGrande = Math.pow(150, 50000);
        System.out.println(resultadoGrande);

        double raizCuadrada = Math.random();
        System.out.println("Raiz de " + resultado + "es" + raizCuadrada);

        //Random
        double aleatorio = Math.random();
        System.out.println("Aleatorio: " + aleatorio);

        double aleatorio2 = Math.random();

        //Para que sea del 0 a 100

        aleatorio2 = aleatorio2 * 100;
        System.out.println("Aleatorio2 es : " + aleatorio2);

        //Para que sea entre 50 y 100

        double aleatorio3 = (Math.random() * 50.0) + 50 ;
        System.out.println("Aleatorio 3 es  un numero de 50 a 100 : " + aleatorio3);

        //redondear
        Math.round(decimal1);
        Math.round(decimal2);
        Math.round(decimal3);

        //Redondear 
        System.out.println(Math.round(decimal1));
        System.out.println(Math.round(decimal2));
        System.out.println(Math.round(decimal3));

        //Redondear para abajo

        System.out.println(Math.floor(decimal1));
        System.out.println(Math.floor(decimal2));
        System.out.println(Math.floor(decimal3));

        //Redondear para arriba
        System.out.println(Math.ceil(decimal1));
        System.out.println(Math.ceil(decimal2));
        System.out.println(Math.ceil(decimal3));

        int parteEntera1 = (int)decimal1;
        System.out.println(parteEntera1);


        //Max y min

        System.out.println("Minimo" + Math.min(decimal1, decimal2));
        System.out.println( "Maximo " + Math.max(decimal1, decimal2));

        //Tres jugadores tiran un dado ( 1 al 6)
        // Muestra la tirada de cada uno de ellos
        //y quien ha sacado el numero mayor

        double jugador1 = Math.round(Math.random() * 6 + 1);
        System.out.println("El jugador 1 es : " + Math.floor(jugador1));
        double jugador2 = Math.round(Math.random() * 6 + 1) ;
        System.out.println( "El jugador 2 es " + Math.floor(jugador2));
        double jugador3 = Math.round(Math.random() * 6 + 1);
        System.out.println( "El jugador 3 es " + Math.floor(jugador3));

        double max1 =(Math.max(jugador1, jugador2));
        double max2 = (Math.max(max1, jugador3));
        double min1 = (Math.min(jugador1, jugador2));
        double min2 = (Math.min(min1, jugador3));

        System.out.println("El numero max : " + max2);
        System.out.println("El minimo es : " + min2);




        //ESTE STA MEJOR!!!!
        int tirada = (int)(Math.random() * 6 + 1 );
        int tirada2 = (int)(Math.random() * 6 + 1 );
        int tirada3 = (int)(Math.random() * 6 + 1 );

        System.out.println("Tirada 1 es : " + tirada);
        System.out.println("Tirada 2 es : " + tirada2);
        System.out.println("Tirada 3 es : " + tirada3);

        int resultadoMax = Math.max(tirada, tirada2);
        resultadoMax = Math.max(resultadoMax, tirada3);
        System.out.println("El máximo es : " + resultadoMax);

        int resultadoMax2 = Math.max(tirada3, Math.max(tirada, tirada2));


        
    }
    
}
