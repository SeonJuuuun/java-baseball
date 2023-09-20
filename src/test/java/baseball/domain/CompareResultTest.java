package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("CompareResult")
public class CompareResultTest {

    @Test
    void 스트라이크_횟수가_0개고_볼_횟수가_0이면_낫싱을_반환한다() {
        CountOfBalls count = new CountOfBalls();

        CompareResult result = new CompareResult(count);

        assertEquals("낫싱", result.toString());
    }

    @Test
    void 스트라이크_횟수가_1개고_볼_횟수가_0이면_1스트라이크를_반환한다() {
        CountOfBalls count = new CountOfBalls();

        count.increaseStrikeCount();

        CompareResult result = new CompareResult(count);
        assertEquals("1스트라이크", result.toString());
    }

    @Test
    public void 스트라이크_횟수가_0개고_볼_횟수가_1이면_1볼을_반환한다() {
        CountOfBalls count = new CountOfBalls();

        count.increaseBallCount();

        CompareResult result = new CompareResult(count);
        assertEquals("1볼", result.toString());
    }


    @Test
    public void 스트라이크_횟수가_3개고_볼_횟수가_0이면_3스트라이크를_반환한다() {
        CountOfBalls count = new CountOfBalls();

        count.increaseStrikeCount();
        count.increaseStrikeCount();
        count.increaseStrikeCount();

        CompareResult result = new CompareResult(count);
        assertEquals("3스트라이크", result.toString());
    }
}
