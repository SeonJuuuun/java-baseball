package baseball.service;

import static org.junit.jupiter.api.Assertions.*;

import baseball.domain.CompareResult;
import baseball.domain.Computer;
import baseball.domain.CountOfBalls;
import baseball.domain.Player;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("BaseballService")
class BaseballServiceTest {

    @Test
    void compare_메서드는_스트라이크_개수와_볼_개수를_계산한다() {
        Computer computer = new Computer(List.of(1, 2, 3));
        Player player = new Player(List.of(1, 2, 3));

        // 테스트 실행
        BaseballService baseballService = new BaseballService();
        CompareResult result = baseballService.compare(computer, player);

        assertEquals(3, result.getCountOfBalls().getStrikeCount());
    }
}