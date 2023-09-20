package baseball;

import baseball.controller.BaseballGame;
import baseball.domain.RandomNumberGenerator;
import baseball.service.BaseballService;

public class Application {
    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame(new RandomNumberGenerator(),
            new BaseballService());
        baseballGame.start();
    }
}
