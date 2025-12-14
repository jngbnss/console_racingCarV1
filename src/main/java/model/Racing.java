package model;

import java.util.List;

public class Racing {
    //게임 횟수가 들어올텐데
    // 카운트 돌리는건 컨트롤러에서 진행하자
    private final List<Car>cars;

    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    public void moveAll(){
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
