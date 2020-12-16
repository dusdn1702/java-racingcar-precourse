package domain;

import racingcar.Car;

import java.util.List;
import java.util.stream.Collectors;

public class Winners {
    private final List<Car> winnerCars;

    public Winners(Cars cars) {
        this.winnerCars = makeWinners(cars);
    }

    private List<Car> makeWinners(Cars cars) {
        Integer winnerPosition = cars.getWinnerPosition();
        return cars.getWinners(winnerPosition);
    }

    @Override
    public String toString() {
        return this.winnerCars.stream().map(Car::toStringName).collect(Collectors.joining(", "));
    }
}
