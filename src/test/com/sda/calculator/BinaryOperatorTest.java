package com.sda.calculator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

/**
 * Created by RENT on 2017-07-03.
 */
public class BinaryOperatorTest {


    private BinaryOperator binaryOperator;
    @Test
    public void shouldAdd() {
        Integer expected = 10;
        //binaryOperator = (x, y) -> x + y;
        binaryOperator = MathOperations.ADD;
        Integer actual = binaryOperator.calulate(3, 7);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldSubtract(){
        Integer expected = 3;
        //binaryOperator = (x,y) -> x-y;

        Integer actual = MathOperations.SUBTRACT.calulate(5,2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldDivide(){
        Integer expected = 3;
        //binaryOperator = (x,y) -> x/y;
        binaryOperator = MathOperations.DIVIDE;
        Integer actual = binaryOperator.calulate(9,3);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldMultiply(){
        Integer expected = 9;
        //binaryOperator = (x,y) -> x*y;
        binaryOperator = MathOperations.MULTIPLY;
        Integer actual = binaryOperator.calulate(3,3);
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenDivideBy0(){
        MathOperations.DIVIDE.calulate(10,0);
    }

}
