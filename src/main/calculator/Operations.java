package calculator;


public class Operations {
    double a;
    double b;

    public Operations(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public void addition() {
        System.out.println("=" + (a + b));
    }

    public void description() {
        System.out.println("=" + (a - b));
    }

    public void multiplication() {
        System.out.println("=" + (a * b));
    }

    public void division() {
        if (b != 0) {
            System.out.println("=" + (a / b));
        } else {
            System.out.println("Nie można dzielić przez '0'");
        }
    }


}