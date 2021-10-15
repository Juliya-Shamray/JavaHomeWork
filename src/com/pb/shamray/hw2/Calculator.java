package com.pb.shamray.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign; // + - * /
        System.out.println("Введите одно число:");
        operand1 = scan.nextInt();
        System.out.println("Введите другое число:");
        operand2 = scan.nextInt();
        System.out.println("введите операцию");
        sign = scan.next();
switch (sign) {
    case "+":
        System.out.println(operand1 + operand2);
        break;
    case "-":
        System.out.println(operand1 - operand2);
        break;
    case "*":
        System.out.println(operand1 * operand2);
        break;
    case "/":
        if (operand2 == 0){
                System.out.println("на ноль делить нельзя"); }
        else {System.out.println(operand1 / operand2);}
        break;
       default:
        System.out.println("Ошибка ввода");
}
}
}





