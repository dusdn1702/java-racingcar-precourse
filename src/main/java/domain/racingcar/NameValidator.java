package domain.racingcar;

import java.util.Arrays;
import java.util.List;

public class NameValidator {
    private static final int MINIMUM_NAME_LENGTH = 5;
    private static final String NOTHING = "";
    private static final String DELIMITER_NAMES = ",";

    public static List<String> makeNames(String receiveNames) {
        for (String name : divideNames(receiveNames)) {
            checkSomethingHere(name);
            checkLessThanFive(name);
        }
        return divideNames(receiveNames);
    }

    private static List<String> divideNames(String receiveNames) {
        return Arrays.asList(receiveNames.split(DELIMITER_NAMES));
    }

    private static void checkSomethingHere(String name) {
        if (name.equals(NOTHING)) {
            throw new IllegalArgumentException("옳지 않은 입력입니다.");
        }
    }

    private static void checkLessThanFive(String name) {
        if (name.length() > MINIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException("이름은 5자 이하여야 합니다.");
        }
    }
}
