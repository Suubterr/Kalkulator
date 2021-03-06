import javax.sound.midi.Soundbank;
import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void mainMenu() {
        System.out.println("Jakie działanie chcesz wykonać.");
        System.out.println("1. Dodawanie.");
        System.out.println("2. Odejmowanie.");
        System.out.println("3. Mnożenie.");
        System.out.println("4. Dzielenie.");
        System.out.println("5. Potęgowanie.");
        System.out.println("0. Zakończ.");
        System.out.println("Wybór: ");
    }

    public static Integer continueApp() {
        System.out.println("Kontynuuj? ...");
        System.out.println("1. TAK. Nowe działanie.");
        System.out.println("2. NIE. Zamknij Kalkulator.");

        Integer choice = userChoice();

        while(choice > 2 || choice < 1) {
            System.out.println("Niepoprawy wybór. Spróbuj jeszcze raz!");
            System.out.println("1. TAK. Nowe działanie.");
            System.out.println("2. NIE. Zamknij Kalkulator.");
            choice = userChoice();
        }

        return choice;
    }

    public static Integer userChoice() {
        Integer userInput = null;
        Scanner scanner = new Scanner(System.in);

        try {
            userInput = scanner.nextInt();
        } catch (InputMismatchException e) {
            userInput = -1;
            System.out.println("Błąd!! Wprowadzona wartość nie jest liczbą!");
        }

        return userInput;
    }
}
