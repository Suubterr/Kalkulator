public class App {

    public void start(Operation operation) {
        Menu.mainMenu();
        operation.setOperationType(Menu.userChoice());

        if (operation.getOperationType() == 0) {
            stop();
        }

        while (operation.getOperationType() > 5) {
            System.out.println("Błędny wybór. Wprowadź poprawną opcję!");
            Menu.mainMenu();
            operation.setOperationType(Menu.userChoice());
        }

        System.out.println("Podaj liczbę A: ");
        operation.setNumberA(Menu.userChoice());
        System.out.println("Podaj liczbę B: ");
        operation.setNumberB(Menu.userChoice());
    }

    public void stop() {
        System.out.println("Zamykanie...");
        System.exit(0);
    }

}
