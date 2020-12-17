package domain.racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Winners {
    public static final String DELIMITER_NAMES_PRINT = ", ";
    private final List<Car> winnerCars;

    public Winners(Cars cars) {
        this.winnerCars = makeWinners(cars);
    }

    private List<Car> makeWinners(Cars cars) {
        int winnerPosition = cars.getWinnerPosition();
        return cars.getWinners(winnerPosition);
    }

    @Override
    public String toString() {
        return this.winnerCars.stream().map(Car::toStringName).collect(Collectors.joining(DELIMITER_NAMES_PRINT));
    }
}
