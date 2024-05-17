package com.patterns.strategy.pseudocode;

class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        int result;

        // Read input from the user
        int firstNumber = 0; // Replace with actual input
        int secondNumber = 0; // Replace with actual input
        String action = ""; // Replace with actual input

        // Set the appropriate strategy based on the user's choice
        if (action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action.equals("subtraction")) {
            context.setStrategy(new ConcreteStrategySubstract());
        } else if (action.equals("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        // Execute the strategy and get the result
        result = context.executeStrategy(firstNumber, secondNumber);

        // Print the result
        System.out.println("Result: " + result);
    }
}