package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.domain.RandomNumberGenerator;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BaseballGame {

    private final RandomNumberGenerator randomNumberGenerator;
    private final BaseballService baseballService;

    public BaseballGame(RandomNumberGenerator randomNumberGenerator,
        BaseballService baseballService) {
        this.randomNumberGenerator = randomNumberGenerator;
        this.baseballService = baseballService;
    }

    public void startGame() {
        OutputView.printStart();
        Computer computerNumber = generateComputerNumber();
        Player playerNumber = generatePlayerNumber();
        compare(computerNumber,playerNumber);
    }

    private Computer generateComputerNumber() {
        return randomNumberGenerator.generate();
    }

    private Player generatePlayerNumber() {
        OutputView.printMessage();
        String playerNumber = InputView.readPlayerNumber();
        return new Player(Arrays.stream(playerNumber.split(""))
            .map(Integer::parseInt)
            .collect(Collectors.toList()));
    }

    private void compare(Computer computer, Player player) {
        int strikeCount = baseballService.getStrikeCount(computer,player);
        int ballCount = baseballService.getBallCount(computer, player);
        ballCount -= strikeCount;
        OutputView.printResult(strikeCount,ballCount);
    }
}
