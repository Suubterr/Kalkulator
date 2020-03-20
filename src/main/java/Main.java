import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        //TODO: testy

        System.out.println("=== Witaj a programie Kalkulator ver.0.01b");

        App app = new App();
        Operation operation = new Operation();

        app.start(operation);
        System.out.println("Wynik: " + operation.calculate());

        Integer cont = Menu.continueApp();
        while (cont == 1) {
            app.start(operation);
            System.out.println("Wynik");
            cont = Menu.continueApp();
        }
    }
}
