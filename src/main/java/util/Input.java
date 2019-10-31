package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);
    private Validator validator = new Validator();
    private Output output = new Output();

    public int getInt(String name) {
        int num;
        output.getMsg("Input number " + name + ":");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
            if (!validator.numIsPositive(num)) {
                output.getMsg("Your must input number > 0");
                scanner.next();
                num = getInt(name);
            }
        } else {
            output.getInstruction();
            scanner.next();
            num = getInt(name);
        }
        return num;
    }

    public String getAnswer() {
        return scanner.next();
    }

}
