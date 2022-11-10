import java.net.SocketTimeoutException;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.util.Locale;
import java.util.Scanner;


public class manejofechas {
    public static void main(String[] args) {
        
        Instant instante = Instant.now();
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        LocalDateTime fechaHoraActual = LocalDateTime.now() ;
        System.out.println("Fecha de ahora " + fechaActual);
        System.out.println("Hora ahora" + horaActual);
        System.out.println( "Fecha y hora actual : " + fechaHoraActual);
        System.out.println("Instante: " + instante);


        System.out.println("_________________________________________________________");


        
        //Crear fecha - of();
        LocalDate fechaCumple = LocalDate.of(2000, 8, 28);
        LocalTime horaExamen = LocalTime.of(12,45);
        LocalDateTime concierto = LocalDateTime.of(2022, 12, 5, 21, 30, 0);

        System.out.println("La hora del cumple es : " + fechaCumple);
        System.out.println("La hora del examen es : " + horaExamen);
        System.out.println("La fecha del concierto es : " + concierto);

        System.out.println("____________________________________________________________");

        //Partes de una fecha

        System.out.println("Dia concierto" + concierto.getDayOfMonth());
        System.out.println("Hora concierto" + concierto.getHour());

        System.out.println("_________________________________________________________________");

        //Añadir o quitar tiempo
        System.out.println("En dos semanas : " + fechaActual.plusWeeks(2));
        System.out.println("Hora actual : "  + horaActual);
        System.out.println("Hace 12 horas : " + horaActual.minusHours(12));

        //Ajustes temporales
        // System.out.println("Primer dia de mes " + fechaActual.with(TemporalAdjuster fechaActual, 1));

        //System.out.println("Primer dia del mes : " + fechaActual.with(TemporalAdjuster.firstDayofNextMonth()));


        //DAR EL FORMATO ESPAÑOL
        DateTimeFormatter formatoMio = DateTimeFormatter.ofPattern("dd/MM/yyyy 'dia' EEEE");
        System.out.println("Fecha con formato : " + fechaActual.format(formatoMio.withLocale(new Locale("fr", "FR"))) );


        //Diferencias entre fechas Period y ChronoUnit
        int diasVividos = (int)ChronoUnit.DAYS.between(fechaCumple, fechaActual);
        System.out.println("Tengo la edad de " + ChronoUnit.YEARS.between(fechaCumple, LocalDate.now()));
        
        System.out.println("Tengo la cantidad de " + ChronoUnit.DAYS.between(fechaCumple, fechaActual) + "dias");

        LocalDate finAnyo = LocalDate.of(2022, 12, 31);
        Period hastaFinAnyo = fechaActual.until(finAnyo);
        System.out.println("Hasta final de año quedan " + hastaFinAnyo);
        System.out.println("Quedan " + hastaFinAnyo.getMonths() + "meses y "  + hastaFinAnyo.getDays() + "dias");

        //Pedir fecha de nacimiento
        //mostrar por pantalla -> dias - mesConLetras - yy
        //mostrar la edad
        //cuanto queda para tu proximo cumpleaños(con chronounit y period)

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu fecha de nacimiento (dias)");
        int dia = sc.nextInt();

        System.out.println("Dime tu mes de nacimiento");
        int mes = sc.nextInt();

        System.out.println("Dime tu año de nacimiento");
        int ano = sc.nextInt();

        LocalDate fechaCumplea = LocalDate.of(2023, mes, dia);

        LocalDate fechaNacimiento = LocalDate.of(ano, mes, dia);
        DateTimeFormatter cumpleresultado = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(fechaNacimiento.format(cumpleresultado));
        Period hastaProximoCumplea = fecha



        //Fechacumple = Fechanacimiento.withYear(2022)
        //FechaProximocumple = XX/XX/2022

        //chronoUnit.day.between(hoy, fechaProximoCumple)<o ? FechaProximoCumple.PlusYear(1).Until(hoy)
        //FechaProximoCumple.unitl(#oY) < o ? FechaProximoCumple.plusyear(1)Until(Hoy);

                        






    }
}
