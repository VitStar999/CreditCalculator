package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        String prepayment = " Якщо 45 000 то 13 500 = 30% ; 18 000 = 40%; 22 500 = 50%; 27 000 = 60%; 31 500 = 70%";
        Calculator12Months calculator12Months = new Calculator12Months(45000,13500,12);
        Calculator24Months calculator24Months = new Calculator24Months(45000,22500,24);
        Calculator36Months calculator36Months = new Calculator36Months(45000,27000,36);
        calculator12Months.creditMonths12();
        calculator24Months.creditMonths24();
        calculator36Months.creditMonths36();










    }
}