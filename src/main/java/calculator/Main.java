package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Jaką operacje chcesz wykonać?");
        System.out.println("1 - dodawania");
        System.out.println("2 - odejmowanie");
        System.out.println("3 - mnożenie");
        System.out.println("4 - dzielenie");
        NumbersOfOperations.number = scaner.nextInt();




        Operations operations = new NumberToOperations(10, 20);
        System.out.println(addition.addition());
        System.out.println(addition.description());
        System.out.println(addition.multiplication());
        System.out.println(addition.division());


    }

}
