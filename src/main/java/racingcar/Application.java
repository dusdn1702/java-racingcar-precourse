package racingcar;

import controller.GameController;
import view.InputView;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        final InputView inputView = new InputView(scanner);
        final GameController gameController = new GameController(inputView);

        gameController.run();
    }
}
