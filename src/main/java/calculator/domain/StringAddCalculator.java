package calculator.domain;

public class StringAddCalculator {
    private static final int INIT_NUMBER = 0;

    private StringAddCalculator() {
    }

    public static int splitAndSum(String expression) {
        if (isNullOrEmpty(expression)) {
            return INIT_NUMBER;
        }

        return ExpressionSplitter.split(expression).stream()
                .map(PositiveNumber::new)
                .mapToInt(PositiveNumber::getValue)
                .sum();
    }

    private static boolean isNullOrEmpty(String expression) {
        return expression == null || expression.isEmpty();
    }
}