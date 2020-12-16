package domain.racingcar;

import utils.RandomUtils;

public class RandomNumber {
    private static final int LOWER_BOUNDARY = 9;
    private static final int UPPER_BOUNDARY = 1;

    private final Integer randomNumber;

    public RandomNumber() {
        this.randomNumber = RandomUtils.nextInt(UPPER_BOUNDARY, LOWER_BOUNDARY);
    }

    public boolean isGreaterThan(int minimumToMove) {
        return randomNumber >= minimumToMove;
    }
}
