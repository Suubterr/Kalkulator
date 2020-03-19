import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n== Start Kalkulator ver0.01b ==\n\n");

        Integer wybór = null;
        Integer liczbaA = null;
        Integer liczbaB = null;
        Integer wynik = null;

        Menu.mainMenu();


        Operation op = new Operation(liczbaA,liczbaB,wybór);
        wynik = op.calculate();

        System.out.println("Oto Twój wynik: " + wynik);


    }

    static void setVariableValuesa
}
