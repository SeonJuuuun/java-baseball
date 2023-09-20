package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Computer")
class ComputerTest {

    @Test
    void getComputerNumberByIndex_메서드는_인덱스의_값을_가져온다() {
        Computer computer = new Computer(List.of(1,5,6));

        assertThat(computer.getComputerNumberByIndex(2)).isEqualTo(6);
    }

    @Test
    void isComputerNumberContainsPlayerNumber_메서드는_PlayerNumber이_포함되어_있는지_확인한다() {
        Computer computer = new Computer(List.of(1,5,6));
        Integer playerNumber = 5;

        assertThat(computer.isComputerNumberContainsPlayerNumber(playerNumber)).isTrue();
    }
}