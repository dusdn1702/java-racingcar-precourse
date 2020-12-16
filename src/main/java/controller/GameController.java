package controller;

import domain.Cars;
import domain.Count;
import domain.NameValidator;
import view.InputView;

import java.util.List;

public class GameController {
    private final InputView inputView;

    public GameController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() {
        List<String> names = NameValidator.makeNames(this.inputView.receiveNames());
        Cars cars = new Cars(names);
        Count count = new Count(CountValidator.makeCount(this.inputView.receiveCount()));
    }
}
