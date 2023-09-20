package baseball.view;

import baseball.domain.Computer;
import baseball.domain.Player;

public class OutputView {

    private OutputView() {
    }

    public static void printStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printResult(int strikeCount, int ballCount) {
        if (strikeCount == 3) {
            System.out.println("3스트라이크");
            endMessage();
            restartMessage();
        }
        if (strikeCount == 0 && ballCount >= 1) {
            System.out.println(ballCount + "볼");
        }
        if (strikeCount >= 1 && ballCount == 0 && strikeCount < 3) {
            System.out.println(strikeCount + "스트라이크");
        }
        if (strikeCount == 0 && ballCount == 0) {
            System.out.println("낫싱");
        }
        if (strikeCount >= 1 && ballCount >= 1) {
            System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
        }
    }

    public static void endMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void restartMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

}
