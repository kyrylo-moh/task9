package contoller;

import model.ModelNumber;
import service.Service;
import util.Input;
import util.Output;

public class Controller {

    private Service service = new Service();
    private Input input = new Input();
    private Output output = new Output();

    public void runController() {
        String answer;
        do {
            ModelNumber modelNumber = new ModelNumber(input.getInt("number"), input.getInt("number`s pow"));
            output.getMsg((service.numberToPow(modelNumber.getNumber(), modelNumber.getPowNumber())));
            output.getMsg("Do you want to continue?\t y/n");
            answer = input.getAnswer();
        } while (answer.equalsIgnoreCase("y") ||
                answer.equalsIgnoreCase("yes"));
    }

}
