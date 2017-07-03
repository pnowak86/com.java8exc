package com.sda.calculator;

import java.util.*;

/**
 * Created by RENT on 2017-07-03.
 */
public class Demo {
    private static Map<String,BinaryOperator> operatorMap;


    public static void main(String[] args) {

        initMap();
           Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak operacji ( + - * / )");
        String action = scanner.nextLine();

        System.out.println("Podaj pierwsza liczbe");
        int a = scanner.nextInt();

        System.out.println("Podaj druga liczne");
        int b = scanner.nextInt();


        BinaryOperator operator = getBinaryOperator(action);
        System.out.println("Wynik " + operator.calulate(a,b));
    }


    private static BinaryOperator getBinaryOperator(String action){
        return operatorMap.get(action);

    }

    public static void initMap()
    {
        operatorMap = new HashMap<>();
        operatorMap.put("+",MathOperations.ADD);
        operatorMap.put("-",MathOperations.SUBTRACT);
        operatorMap.put("/",MathOperations.DIVIDE);
        operatorMap.put("*",MathOperations.MULTIPLY);
    }

//
//

//    String sign;


}
