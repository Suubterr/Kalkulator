public class Operation {

    Integer numberA;
    Integer numberB;
    Integer operationType;

    public Operation(Integer numberA, Integer numberB, Integer operationType) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.operationType = operationType;
    }

    public Integer add() {
        return numberA + numberB;
    }

    public Integer substract() {
        return numberA - numberB;
    }

    public Integer divide() {
        return numberA / numberB;
    }

    public Integer multiply() {
        return numberA * numberB;
    }

    public Integer power() {

        int result = numberA;

        for (int i = 1; i < numberB; i++) {
            result *= numberA;
        }

        return result;
    }

    public Integer calculate() {

        switch (operationType) {
            case 1:
                return add();
            case 2:
                return substract();
            case 3:
                return divide();
            case 4:
                return multiply();
            case 5:
                return power();
            default:
                System.out.println("Błąd! Niepoprawny wybór!");
                return null;
        }
    }

    public Integer getNumberA() {
        return numberA;
    }

    public void setNumberA(Integer numberA) {
        this.numberA = numberA;
    }

    public Integer getNumberB() {
        return numberB;
    }

    public void setNumberB(Integer numberB) {
        this.numberB = numberB;
    }

    public Integer getOperationType() {
        return operationType;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }
}
