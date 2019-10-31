package contoller;

import model.ModelNumber;
import service.Service;
import util.Input;
import util.Output;

public class Controller {

    Service service = new Service();
    Input input = new Input();
    Output output = new Output();

    public void runController() {
        String answer;
        do {
            ModelNumber modelNumber = new ModelNumber(input.getInt(), input.getInt());
            output.getMsg((service.numberToPow(modelNumber.getNumber(), modelNumber.getPowNumber())));
            output.getMsg("Do you want to continue?\t y/n");
            answer = input.getAnswer();
        } while (answer.equalsIgnoreCase("y") ||
                answer.equalsIgnoreCase("yes"));
    }

}
