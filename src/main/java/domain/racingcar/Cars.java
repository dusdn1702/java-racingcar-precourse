package domain.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static domain.racingcar.Position.INIT_POSITION;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> names) {
        cars = new ArrayList<>();
        for (String name : names) {
            cars.add(CarFactory.createCar(name));
        }
    }

    public List<String> playOneCount() {
        for (Car car : cars) {
            car.giveRandomNumber(new RandomNumber());
        }
        return getResult();
    }

    private List<String> getResult() {
        return cars.stream().map(Car::toString).collect(Collectors.toList());
    }

    public Integer getWinnerPosition() {
        int nowPosition = INIT_POSITION;
        for (Car car : cars) {
            nowPosition = car.comparePosition(nowPosition);
        }
        return nowPosition;
    }

    public List<Car> getWinners(Integer position) {
        return cars.stream().filter(car -> car.isSamePosition(position)).collect(Collectors.toList());
    }
}
