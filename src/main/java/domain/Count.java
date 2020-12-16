package domain;

import static domain.CountValidator.MINIMUM_TO_COUNT;

public class Count {
    private Integer count;

    public Count(Integer count) {
        this.count = count;
    }

    public boolean isGreaterThanOneWithDecreasing() {
        return this.count-- > MINIMUM_TO_COUNT;
    }
}
