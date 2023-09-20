package baseball.controller;

import baseball.domain.CompareResult;
import baseball.domain.Computer;
import baseball.domain.Player;
import baseball.domain.RandomNumberGenerator;
import baseball.domain.Retry;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BaseballGame {

    private static final String ALL_STRIKE = "3스트라이크";

    private final RandomNumberGenerator randomNumberGenerator;
    private final BaseballService baseballService;

    public BaseballGame(RandomNumberGenerator randomNumberGenerator,
        BaseballService baseballService) {
        this.randomNumberGenerator = randomNumberGenerator;
        this.baseballService = baseballService;
    }

    public void start() {
        OutputView.printStart();
        playGame();
    }

    private void playGame() {
        while (true) {
            Computer computerNumber = generateComputerNumber();
            calculateNumber(computerNumber);
            Retry retry = selectRetryCommand();
            if (isEnd(retry)) {
                break;
            }
        }
    }

    private void calculateNumber(Computer computerNumber) {
        while (true) {
            Player playerNumber = generatePlayerNumber();
            CompareResult compareResult = baseballService.compare(computerNumber, playerNumber);
            OutputView.printResult(compareResult);
            if (isResultAllStrike(compareResult)) {
                OutputView.endMessage();
                break;
            }
        }
    }

    private boolean isResultAllStrike(CompareResult compareResult) {
        return compareResult.toString().equals(ALL_STRIKE);
    }

    private boolean isEnd(Retry retry) {
        return retry == Retry.STOP;
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

    private Retry selectRetryCommand() {
        OutputView.restartMessage();
        String retryCommand = InputView.readRestartCommand();
        return Arrays.stream(Retry.values())
            .filter(retry -> retry.getCommand() == Integer.parseInt(retryCommand))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("1 또는 2를 입력해야 합니다."));
    }
}
