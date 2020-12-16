package controller;

public class CountValidator {
    public static Integer makeCount(String receiveCount) {
        return makeNumber(receiveCount);
    }

    private static Integer makeNumber(String receiveCount) {
        try{
            return Integer.parseInt(receiveCount);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("시도 횟수는 숫자여야 한다.");
        }
    }
}
