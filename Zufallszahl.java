public class Zufallszahl {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1; // Zufallszahl zwischen 1 und 100
        System.out.println("The random number is: " + randomNumber);
    }
}
