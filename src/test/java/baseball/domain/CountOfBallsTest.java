package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("CountOfBalls")
public class CountOfBallsTest {

    @Test
    void increaseBallCount_메서드는_볼_횟수를_1_증가시킨다() {
        CountOfBalls count = new CountOfBalls();

        count.increaseBallCount();

        assertEquals(1, count.getBallCount());
    }

    @Test
    void increaseStrikeCount_메서드는_스트라이크_횟수를_1_증가시킨다() {
        CountOfBalls count = new CountOfBalls();

        count.increaseStrikeCount();

        assertEquals(1, count.getStrikeCount());
    }

    @Test
    void isThreeStrike_메서드는_스트라이크_카운트가_3일때_true를_반환한다() {
        CountOfBalls count = new CountOfBalls();

        count.increaseStrikeCount();
        count.increaseStrikeCount();
        count.increaseStrikeCount();

        assertTrue(count.isThreeStrike());
    }

    @Test
    void isNothing_메서드는_볼_횟수와_스트라이크_횟수가_0이면_true를_반환한다() {
        CountOfBalls count = new CountOfBalls();

        assertTrue(count.isNothing());
    }
}
