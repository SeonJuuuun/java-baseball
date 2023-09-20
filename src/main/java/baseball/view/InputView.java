package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private InputView() {
    }

    public static String readPlayerNumber() {
        String playerNumber = Console.readLine();
        validatePlayerNumber(playerNumber);
        return playerNumber;
    }

    private static void validatePlayerNumber(String inputs) {
        validateBlank(inputs);
        validateInteger(inputs);
    }

    private static void validateBlank(String inputs) {
        if (inputs.isBlank()) {
            throw new IllegalArgumentException("올바르지 않은 입력입니다.");
        }
    }

    private static Integer validateInteger(String inputs) {
        try {
            return Integer.valueOf(inputs);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자를 입력해야 합니다.");
        }
    }
}
