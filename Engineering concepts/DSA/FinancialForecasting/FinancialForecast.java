package FinancialForecasting;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double principal, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return principal;
        }

        // Recursive case
        return futureValue(principal, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        double principal = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double result = futureValue(principal, growthRate, years);

        System.out.printf("Future Value after %d years = %.2f%n", years, result);
    }
}

/*
Output:
Future Value after 5 years = 16105.10

Learned:
- Recursion is a method that calls itself.
- Every recursive function needs a base case and a recursive case.
- Future value is calculated using the previous year's value.
- Time Complexity: O(n)
- Space Complexity: O(n) (due to recursion stack)
- Iterative approach can reduce space complexity to O(1).
*/