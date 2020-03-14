package calculator;


public class Operations {
    double a;
    double b;

    public Operations(double a, double b) {
        this.a = a;
        this.b = b;
    }


    public double addition() {
        return a + b;
    }

    public double description() {
        return a - b;
    }

    public double multiplication() {
        return a * b;
    }

    public double division() {
        return a / b;
    }


}