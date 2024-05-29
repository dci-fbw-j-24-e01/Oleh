public class IncorrectProductIdException extends Exception {
    protected int incorrectNumber;

    public IncorrectProductIdException(int incorrectNumber) {
        this.incorrectNumber = incorrectNumber;
    }

    public IncorrectProductIdException() {
    }

    public int getIncorrectNumber() {
        return incorrectNumber;
    }

    public void setIncorrectNumber(int incorrectNumber) {
        this.incorrectNumber = incorrectNumber;
    }

    @Override
    public String toString() {
        return "IncorrectProductIdException{" +
                "incorrectNumber=" + incorrectNumber +
                '}';
    }
}
