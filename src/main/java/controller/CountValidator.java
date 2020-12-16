package controller;

public class CountValidator {

    public static final int MINIMUM_TO_COUNT = 0;

    public static Integer makeCount(String receiveCount) {
        Integer count = makeNumber(receiveCount);
        checkPositiveNumber(count);
        return count;
    }

    private static void checkPositiveNumber(Integer makeNumber) {
        if(makeNumber< MINIMUM_TO_COUNT){
            throw new IllegalArgumentException("시도 횟수는 양수여야 한다.");
        }
    }

    private static Integer makeNumber(String receiveCount) {
        try{
            return Integer.parseInt(receiveCount);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("시도 횟수는 숫자여야 한다.");
        }
    }
}
