package woche02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Umrechnungen {
    public static void main(String[] args) {
        double celsius = 0;
        double fahrenheit = 0;
        double kreis = 0;
        double radius = 0;
        double stunden = 0;
        double sekunden = 0;
        double minuten = 0;

        // Temperatur umrechnen mit Benutzereingabe vorher
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Temperatur in Celsius: ");
        try {
            celsius = Double.parseDouble(r.readLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temperatur in Fahrenheit: " + fahrenheit);

        // Kreisumfang berechnen

        System.out.println("Geben Sie den Radius des Kreises an: ");
        try {
            radius = Double.parseDouble(r.readLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        kreis = 2 * Math.PI * radius;
        System.out.println("Kreisumfang: " + kreis);

        sekunden = 12.345;
        minuten = sekunden / 60;
        stunden = minuten / 60;
        System.out.println("Sekunden: " + sekunden);
        System.out.println("Minuten: " + minuten);
        System.out.println("Stunden: " + stunden);
    }
}
