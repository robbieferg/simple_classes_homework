public class Printer {
    private int remainingSheets;
    private int tonerVolume;

    public Printer(int remainingSheets, int tonerVolume) {
        this.remainingSheets = remainingSheets;
        this.tonerVolume = tonerVolume;
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

    public int getTonerVolume() {
        return this.tonerVolume;
    }
}
