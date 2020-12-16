package controller;

import domain.*;
import domain.racingcar.Cars;
import domain.racingcar.NameValidator;
import domain.racingcar.Winners;
import view.InputView;
import view.OutputView;

import java.util.List;

public class GameController {
    private final InputView inputView;

    public GameController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() {
        List<String> names = generateNames();
        Cars cars = new Cars(names);
        Count count = new Count(generateCount());

        playGame(cars, count);

        makeWinners(cars);
    }

    private List<String> generateNames() {
        try {
            return NameValidator.makeNames(this.inputView.receiveNames());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return generateNames();
        }
    }

    private Integer generateCount() {
        try {
            return CountValidator.makeCount(this.inputView.receiveCount());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return generateCount();
        }
    }

    private void playGame(Cars cars, Count count) {
        OutputView.printResultNotice();
        do {
            OutputView.printResult(cars.playOneCount());
            OutputView.printOneLine();
        } while (count.isGreaterThanOneWithDecreasing());
    }

    private void makeWinners(Cars cars) {
        Winners winners = new Winners(cars);
        OutputView.printWinners(winners.toString());
    }
}
