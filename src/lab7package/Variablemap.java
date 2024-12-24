package lab7package;

import java.util.HashMap;
import java.util.Map;

/**
 * The Variablemap class is a Singleton that maintains a mapping of variable names to their integer values.
 * It is used to store and retrieve variables for interpreting mathematical expressions.
 */
public class Variablemap {
    private static Variablemap instance;
    private final Map<String, Integer> variables;

    /**
     * Private constructor to enforce Singleton pattern.
     * Initializes the internal map for storing variable values.
     */
    private Variablemap() {
        variables = new HashMap<>();

    }

    /**
     * Retrieves the singleton instance of Variablemap.
     * If the instance does not exist, it will be created.
     *
     * @return The singleton instance of Variablemap.
     */
    public static Variablemap getInstance() {
        if (instance == null) {
            instance = new Variablemap();
        }
        return instance;
    }

    /**
     * Sets the value of a variable.
     *
     * @param name  The name of the variable.
     * @param value The integer value to assign to the variable.
     */
    public void setValue(String name, int value) {
        variables.put(name, value);
    }

    /**
     * Retrieves the value of a variable.
     *
     * @param name The name of the variable.
     * @return The integer value associated with the variable.
     * @throws IllegalArgumentException If the variable is not defined in the map.
     */
    public int getValue(String name) {
        if (!variables.containsKey(name)) {
            throw new IllegalArgumentException("Variable '" + name + "' is not defined.");
        }
        return variables.get(name);
    }
}
