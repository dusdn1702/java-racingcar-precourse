package domain.racingcar;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public static Cars generateCars(String name) { // a,b,c
        List<String> names = NameValidator.makeNames(name);
        List<Car> cars = new ArrayList<>();

        for (String value : names) {
            cars.add(new Car(value));
        }

        return new Cars(cars);
    }
}
