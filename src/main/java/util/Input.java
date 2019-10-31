package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);
    private Validator validator = new Validator();
    private Output output = new Output();

    public int getInt() {
        int num;
        System.out.println("Input number:");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (!validator.numIsPositive(num)) {
                System.out.println("Your must input number > 0");
                scanner.next();
                num = getInt();
            }
        } else {
            output.getInstruction();
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public String getAnswer() {
        return scanner.next();
    }

}
