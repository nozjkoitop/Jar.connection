package com.epam.jwd.task2.jarconnection;

import com.epam.jwd.task2.Calculator;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        String first = "1+1/2";
        String second = "1-1*2";
        String third = "3+(1*7)/7";

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String forth = scanner.nextLine();

        List<String> expressions = List.of(first, second, third, forth );

        for (String  example : expressions) {
            Calculator calculator = new Calculator(example);
            System.out.println(calculator.solve());
        }
    }
}
