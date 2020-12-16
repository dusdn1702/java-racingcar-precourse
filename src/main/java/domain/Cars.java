package domain;

import racingcar.Car;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars(List<String> names) {
        cars = new ArrayList<>();
        for(String name: names) {
            cars.add(CarFactory.createCar(name));
        }
    }
}
