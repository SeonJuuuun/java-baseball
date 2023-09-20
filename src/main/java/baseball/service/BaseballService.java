package baseball.service;

import baseball.domain.CompareResult;
import baseball.domain.Computer;
import baseball.domain.CountOfBalls;
import baseball.domain.Player;

public class BaseballService {

    private static final int MAX_SIZE = 3;

    public CompareResult compare(Computer computer, Player player) {
        CountOfBalls countOfBalls = new CountOfBalls();
        calculateStrikeCount(computer,player,countOfBalls);
        calculateBallCount(computer,player,countOfBalls);
        return new CompareResult(countOfBalls);
    }

    private void calculateStrikeCount(Computer computer, Player player, CountOfBalls countOfBalls) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (computer.getComputerNumberByIndex(i) == player.getPlayerNumberByIndex(i)) {
                countOfBalls.increaseStrikeCount();
            }
        }
    }

    private void calculateBallCount(Computer computer, Player player, CountOfBalls countOfBalls) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (computer.isComputerNumberContainsPlayerNumber(player.getPlayerNumberByIndex(i))) {
                countOfBalls.increaseBallCount();
            }
        }
    }
}
