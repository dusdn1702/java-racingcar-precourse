package domain;

import racingcar.Car;

public class CarFactory {
    public static Car createCar(String name) {
        return new Car(name);
    }
}
