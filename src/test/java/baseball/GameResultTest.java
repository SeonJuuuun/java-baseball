package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.jupiter.api.Test;

import baseball.view.GameResult;

class GameResultTest {

	@Test
	void printResult_3Strikes() {
		GameResult gameResult = new GameResult();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream originalOutput = System.out;
		System.setOut(new PrintStream(outputStream));

		gameResult.printResult(3, 0);

		System.setOut(originalOutput);
		String capturedOutput = outputStream.toString().trim();

		String expectedOutput = "3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

		assertThat(capturedOutput).isEqualTo(expectedOutput);
	}
}