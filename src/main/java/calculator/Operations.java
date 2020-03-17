package calculator;

public class Operations {


        if (NumbersOfOperations.number > 1 && NumbersOfOperations.number < 4){
        switch (NumbersOfOperations.number) {
            case 1:
                return NumberToOperations.a + NumberToOperations.b;
            break;
            case 2:
                return a - b;
            break;
            case 3:
                return a * b;
            break;
            case 4:
                if (b != 0) {
                    return a / b;
                } else {
                }
                break;
        }
    }

        return 0;
}


}

