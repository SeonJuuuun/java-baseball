package baseball.domain;

import java.util.List;

public class Player {

    private final List<Integer> playerNumber;

    public Player(List<Integer> playerNumber) {
        validatePlayerNumber(playerNumber);
        this.playerNumber = playerNumber;
    }

    private void validatePlayerNumber(List<Integer> playerNumber) {
        validateSize(playerNumber);
    }

    private void validateSize(List<Integer> playerNumber) {
        if(playerNumber.size() != 3){
            throw new IllegalArgumentException("3자리를 입력 해야 합니다.");
        }
    }

    public int getPlayerNumberByIndex(int index) {
        return playerNumber.get(index);
    }
}
