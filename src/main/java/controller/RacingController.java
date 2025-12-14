package controller;

import model.Car;
import model.Racing;
import util.Parse;
import validate.Validator;
import view.InputView;
import view.OutputView;

import java.util.List;

public class RacingController {

    public void run() {
        // 1. 자동차 이름 입력 + 검증
        String inputNames = InputView.readCarNames();
        Validator.inputValidate(inputNames);

        List<String> names = Parse.parse(inputNames);

        List<Car> cars = names.stream()
                .map(Car::new)
                .toList();

        // 2. 시도 횟수 입력 + 검증
        String inputCount = InputView.readCount();
        int count = Validator.countValidate(inputCount);

        // 3. 레이싱 준비
        Racing racing = new Racing(cars);
        OutputView.printResultMessage();

        // 4. 레이싱 진행
        for (int i = 0; i < count; i++) {
            racing.moveAll();
            OutputView.printRoundResult(racing.getCars());
        }
    }
}
