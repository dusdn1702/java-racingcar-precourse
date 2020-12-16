package domain;

public class Count {
    private Integer count;

    public Count(Integer count) {
        this.count = count;
    }

    public boolean isGreaterThanOneWithDecreasing() {
        return this.count-->0;
    }
}
