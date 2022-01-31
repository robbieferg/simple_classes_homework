public class Printer {
    private int remainingSheets;

    public Printer(int remainingSheets) {
        this.remainingSheets = remainingSheets;
    }

    public int getRemainingSheets() {
        return this.remainingSheets;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        Calculator calculator = new Calculator();
        int totalPages = calculator.multiply(numberOfPages, numberOfCopies);
        if (totalPages <= this.remainingSheets) {
            this.remainingSheets -= totalPages;
        }
    }
}
