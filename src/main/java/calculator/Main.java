package calculator;

public class Main {
    public static void main(String[] args) {

        Operations addition = new Operations(10, 20);
        System.out.println(addition.addition());
        System.out.println(addition.description());
        System.out.println(addition.multiplication());
        System.out.println(addition.division());


    }

}
