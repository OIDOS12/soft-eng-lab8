package lab7package;

import java.util.HashMap;
import java.util.Map;

/**
 * The Number class represents a numeric variable in the expression tree.
 */

public class Variable implements Expression {
    private String name;

    /**
     * Constructs a Variable with the given value.
     *
     * @param name The integer value to represent.
     */

    public Variable(String name) {
        this.name = name;
    }

    /**
     * Returns the numeric value.
     * @return The numeric value.
     */

    @Override
    public int evaluate() {
        return Variablemap.getInstance().getValue(name);
    }
}


