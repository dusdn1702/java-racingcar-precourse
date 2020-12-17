package domain.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static domain.racingcar.Position.INIT_POSITION;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<String> playOneCount() {
        for (Car car : cars) {
            car.moveByRandomNumber(new RandomNumber());
        }
        return report();
    }

    private List<String> report() {
        return cars.stream()
                .map(Car::toString)
                .collect(Collectors.toList());
    }

    public int getWinnerPosition() {
        int nowPosition = INIT_POSITION;
        for (Car car : cars) {
            nowPosition = car.comparePosition(nowPosition);
        }

        return nowPosition;
    }

    public List<Car> getWinners(Integer position) {
        return cars.stream()
                .filter(car -> car.isSamePosition(position))
                .collect(Collectors.toList());
    }
}
