package racingcar;

public class Position {
    public static final int INIT_POSITION = 0;
    public static final String UNIT_EXPRESSION_OF_POSITION = "-";

    private int position;

    public Position() {
        this.position = INIT_POSITION;
    }

    public void move() {
        this.position++;
    }

    @Override
    public String toString() {
        StringBuilder printPosition = new StringBuilder();
        for (int i = 0; i < this.position; i++) {
            printPosition.append(UNIT_EXPRESSION_OF_POSITION);
        }
        return printPosition.toString();
    }

    public Integer getBiggerPosition(Integer nowPosition) {
        if (this.position > nowPosition) {
            return this.position;
        }
        return nowPosition;
    }

    public boolean isSameThan(Integer position) {
        return this.position == position;
    }
}
