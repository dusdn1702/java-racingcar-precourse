package controller;

import view.InputView;

public class GameController {
    private InputView inputView;

    public GameController(InputView inputView) {
        this.inputView = inputView;
    }

    public void run() {
        System.out.println(this.inputView.receiveNames());
    }
}
