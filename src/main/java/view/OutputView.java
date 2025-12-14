package view;

import model.Car;

import java.util.List;

public class OutputView {

    public static void printResultMessage() {
        System.out.println("\n실행 결과");
    }

    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + car.getDistance());
        }
        System.out.println();
    }
}
