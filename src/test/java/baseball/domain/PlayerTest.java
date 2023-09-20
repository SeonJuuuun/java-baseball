package baseball.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Player")
class PlayerTest {

    @Test
    void 생성자는_올바르지_않은_사이즈를_입력시_IllegalArgumentException_발생시킨다() {
        assertThatThrownBy(() -> new Player(List.of(1, 2))).isInstanceOf(
            IllegalArgumentException.class);
    }
}