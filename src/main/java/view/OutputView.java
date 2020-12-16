package view;

import domain.Winners;

import java.util.List;

public class OutputView {
    public static void printResultNotice() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public static void printResult(List<String> oneCountResults) {
        for(String oneCarResult : oneCountResults){
            System.out.println(oneCarResult);
        }
    }

    public static void printOneLine() {
        System.out.println();
    }

    public static void printWinners(String winnersName) {
        System.out.println("최종 우승자: "+winnersName);
    }
}
