package controller;

import domain.Cars;
import domain.Count;
import domain.NameValidator;
import domain.Winners;
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

        OutputView.printResultNotice();
        do {
            OutputView.printResult(cars.playOneCount());
            OutputView.printOneLine();
        } while (count.isGreaterThanOneWithDecreasing());

        Winners winners = new Winners(cars);
        OutputView.printWinners(winners.toString());
    }

    private Integer generateCount() {
        try {
            return CountValidator.makeCount(this.inputView.receiveCount());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return generateCount();
        }
    }

    private List<String> generateNames() {
        try {
            return NameValidator.makeNames(this.inputView.receiveNames());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return generateNames();
        }
    }
}
