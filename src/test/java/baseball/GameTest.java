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
}