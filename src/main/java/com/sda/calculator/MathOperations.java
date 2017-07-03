package com.sda.calculator;

/**
 * Created by RENT on 2017-07-03.
 */
public class MathOperations {

    public final static BinaryOperator ADD = (a, b) -> a + b;
    public final static BinaryOperator SUBTRACT = (a, b) -> a - b;
    public final static BinaryOperator DIVIDE = (a, b) -> {
        if(b==0){
            throw new IllegalArgumentException("Cant divide by 0!");
        }
        return a/b;
    };

    public final static BinaryOperator MULTIPLY = (a, b) -> a * b;
}
