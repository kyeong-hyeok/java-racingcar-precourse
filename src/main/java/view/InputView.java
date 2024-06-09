package view;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    private Scanner scanner;
    private Validator validator;

    public InputView() {
        this.scanner = new Scanner(System.in);
        this.validator = new Validator();
    }

    public String inputCarNames() {
        System.out.println(INPUT_CAR_NAME_MESSAGE);
        String input = scanner.nextLine();
        validator.validateCarName(input);
        return input;
    }

}
