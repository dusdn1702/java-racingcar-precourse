package racingcar;

import domain.RandomNumber;

public class Car {
    public static final int MINIMUM_TO_MOVE = 4;

    private Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    // 추가 기능 구현
    public void giveRandomNumber(RandomNumber randomNumber) {
        if (randomNumber.isGreaterThan(MINIMUM_TO_MOVE)) {
            this.position.move();
        }
    }

    public String toString() {
        return name.toString() + " : " + position.toString();
    }

    public String toStringName(){
        return name.toString();
    }

    public Integer comparePosition(Integer nowPosition) {
        return this.position.getBiggerPosition(nowPosition);
    }

    public boolean isSamePosition(Integer position) {
        return this.position.isSameThan(position);
    }
}
