package lab7package;

/**
 * The Main class serves as the entry point of the application.
 * It demonstrates the usage of the Singleton pattern for evaluating a mathematical expression.
 */

public class Main {

    /**
     * The main method executes the application logic.
     * It initializes variable mappings and evaluates it.
     * @param args Command-line arguments passed to the application.
     */

    public static void main(String[] args) {
        Variablemap variableMap = Variablemap.getInstance();
        Variablemap variableMap2 = Variablemap.getInstance();

        variableMap.setValue("x", 5);
        variableMap2.setValue("y", 10);

        Expression expression = new MultiplyExpression(
                new AddExpression(
                        new Variable("x"),
                        new Variable("y")
                ),
                new Number(2)
        );

        System.out.println("Result: " + expression.evaluate());


    }
}