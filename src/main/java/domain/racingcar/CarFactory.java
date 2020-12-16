package domain.racingcar;

public class CarFactory {
    public static Car createCar(String name) {
        return new Car(name);
    }
}
