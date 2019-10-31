package service;

public class Service {

    public int numberToPow(int number, int numberPow) {
        if (numberPow == 0) {
            return 1;
        }
        else if (numberPow == 1) {
            return number;
        }
        else if (numberPow == 2) {
            return number * number;
        }
        else if (numberPow % 2 == 0) {
            return numberToPow(numberToPow(number, numberPow / 2), 2);
        }
        else {
            return number * (numberToPow(number, numberPow - 1));
        }
    }

}
