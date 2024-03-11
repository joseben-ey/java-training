package Program2;

public class AverageCalculator {
    public double calAverage(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive natural number.");
        }

        int sum = n * (n + 1) / 2;

        return (double) sum / n;
    }

    public static void main(String[] args) {
        try {
            AverageCalculator calculator = new AverageCalculator();
            int n = 10; // Example: Calculate average of first 10 natural numbers
            double average = calculator.calAverage(n);
            System.out.println("Average of the first " + n + " natural numbers: " + average);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
