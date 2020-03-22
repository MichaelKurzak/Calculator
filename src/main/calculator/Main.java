package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbe");
        double firstNumber = scanner.nextInt();
        System.out.println("Podaj 2 liczbe");
        double secondNumber = scanner.nextInt();
        System.out.println("Podaj numer operacji");
        System.out.println("1 - dodawanie");
        System.out.println("2 - odejmowanie");
        System.out.println("3 - mnożenie");
        System.out.println("4 - dzielenie");
        int numberOperatione = scanner.nextInt();


        Operations operations = new Operations(firstNumber, secondNumber);

        switch (numberOperatione) {
            case 1:
                operations.addition();
                break;
            case 2:
                operations.description();
                break;
            case 3:
                operations.multiplication();
                break;
            case 4:
                operations.division();
                break;
        }

    }

}