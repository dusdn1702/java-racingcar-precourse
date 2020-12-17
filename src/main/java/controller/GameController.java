package controller;

import domain.*;
import domain.racingcar.CarFactory;
import domain.racingcar.Cars;
import domain.racingcar.NameValidator;
import domain.racingcar.Winners;
import view.InputView;
import view.OutputView;

public class GameController {
    public void run(final InputView inputView) {
        Cars cars = generateCars(inputView);
        Count count = generateCount(inputView);

        playGame(cars, count);
        makeWinners(cars);
    }

    private Cars generateCars(final InputView inputView) {
        while (true) {
            try {
                return CarFactory.generateCars(inputView.receiveNames());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Count generateCount(final InputView inputView) {
        try {
            int count = CountValidator.makeCount(inputView.receiveCount());
            return new Count(count);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return generateCount(inputView);
        }
    }

    private void playGame(Cars cars, Count count) {
        OutputView.printResultNotice();
        do {
            OutputView.printResult(cars.playOneCount());
            count.playOnce();
            OutputView.printOneLine();
        } while (count.isGreaterThanOne());
    }

    private void makeWinners(Cars cars) {
        Winners winners = new Winners(cars);
        OutputView.printWinners(winners.toString());
    }
}
