package domain;

import java.util.Arrays;
import java.util.List;

public class NameValidator {
    public static List<String> makeNames(String receiveNames) {
        for(String name: divideNames(receiveNames)){
            checkSomethingHere(name);
            checkLessThanFive(name);
        }
        return divideNames(receiveNames);
    }

    private static void checkLessThanFive(String name) {
        if(name.length()>5){
            throw new IllegalArgumentException("이름은 5자 이하여야 합니다.");
        }
    }

    private static void checkSomethingHere(String name) {
        if(name.equals("")){
            throw new IllegalArgumentException("옳지 않은 입력입니다.");
        }
    }

    private static List<String> divideNames(String receiveNames) {
        return Arrays.asList(receiveNames.split(","));
    }
}
