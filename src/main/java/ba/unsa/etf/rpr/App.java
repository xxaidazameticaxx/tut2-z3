package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Napraviti program koji unosi brojeve i sprema ih u listu.
 * Ukoliko ste unijeli “stop” program se zaustavlja, a na neku drugu riječ/slovo ponavlja unos,
 * a u suprotnom računa sljedeće: min, max, mean i standardnu devijaciju.
 * Za implementaciju je potrebno koristiti java.util.List klasu.
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner ulaz = new Scanner(System.in);
        List<Double>brojevi = new ArrayList<>();
        while(true) {
            System.out.println("Unesite željene broj ili unesite stop za kraj.");
            String linija = ulaz.nextLine();
            if("stop".equalsIgnoreCase(linija.trim())) break;
            try{
                Double broj = Double.parseDouble(linija);
                brojevi.add(broj);
            }
            catch(Exception e){
                System.out.println("Uneseni string nije broj");
                continue;
            }

        }

        System.out.println("Maksimum je: " + MathUtils.max(brojevi));
        System.out.println("Minimum je: " + MathUtils.min(brojevi));
        System.out.println("Standardna devijacija je: " + MathUtils.stdev(brojevi));
        System.out.println("Mean je: " + MathUtils.mean(brojevi));


    }
}
