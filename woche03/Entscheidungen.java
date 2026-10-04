package woche03;

public class Entscheidungen {
    public static void main(String[] args) {
        String zahl = "";
        String jahr = "";
        Boolean schaltjahr = false;
        // kleines 1 mal 1
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        // FizzBuzz

        for (int i = 1; i <= 100; i++) {
            zahl = "" + i;
            if (i % 3 == 0 && i % 5 == 0) {
                zahl += " -> FizzBuzz";
            } else if (i % 3 == 0) {
                zahl += " -> Fizz";
            } else if (i % 5 == 0) {
                zahl += " -> Buzz";
            }
            System.out.println(zahl);
        }

        // Schaltjahr ermittlen
        System.out.println("Geben Sie eine Jahreszahl ein: ");
        try {
            jahr = IO.readln();
            int jahreszahl = Integer.parseInt(jahr);
            if (jahreszahl % 4 == 0) {
                schaltjahr = true;
            }
            if (jahreszahl % 4 == 0 && jahreszahl % 100 == 0) {
                schaltjahr = false;
            }
            if (jahreszahl % 4 == 0 && jahreszahl % 400 == 0) {
                schaltjahr = true;
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

        if (schaltjahr == true) {
            System.out.println(jahr + " ist ein Schaltjahr!");

        } else {
            System.out.println(jahr + " ist kein Schaltjahr!");
        }

    }
}
