package baseball;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import baseball.controller.Game;
import baseball.domain.Computer;
import baseball.domain.Judge;
import baseball.domain.PlayerNumber;

class GameTest {

	@Test
	void judge_3Strike() {
		//given

		Computer computer = new Computer(List.of(1, 2, 3));
		PlayerNumber playerNumber = new PlayerNumber(List.of(1, 2, 3));
		Game game = new Game();

		//when
		Judge result = game.judge(computer, playerNumber);

		//then
		assertThat(result.getStrikeCount()).isEqualTo(3); // 예상되는 스트라이크 개수 입력
		assertThat(result.getBallCount()).isEqualTo(0); // 예상되는 볼 개수 입력
	}

	@Test
	void judge_1Strike_2Ball() {
		//given
		Computer computer = new Computer(List.of(1, 2, 3));
		PlayerNumber playerNumber = new PlayerNumber(List.of(1, 3, 2));
		Game game = new Game();

		//when
		Judge result = game.judge(computer, playerNumber);

		//then
		assertThat(result.getStrikeCount()).isEqualTo(1); // 예상되는 스트라이크 개수 입력
		assertThat(result.getBallCount()).isEqualTo(2); // 예상되는 볼 개수 입력
	}

	@Test
	void judge_0Strike_2Ball() {
		//given
		Computer computer = new Computer(List.of(1, 2, 3));
		PlayerNumber playerNumber = new PlayerNumber(List.of(2, 1, 4));
		Game game = new Game();

		//when
		Judge result = game.judge(computer, playerNumber);

		//then
		assertThat(result.getStrikeCount()).isEqualTo(0); // 예상되는 스트라이크 개수 입력
		assertThat(result.getBallCount()).isEqualTo(2); // 예상되는 볼 개수 입력
	}
}