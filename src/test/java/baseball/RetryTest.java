package baseball;



import static org.assertj.core.api.AssertionsForInterfaceTypes.*;

import org.junit.jupiter.api.Test;

import baseball.domain.Retry;

class RetryTest {

	@Test
	void retry_1_2_테스트() {
	    //given <= 이렇게 주어졌을때

	    //when <= 이걸 실행하면

	    //then <= 이렇게 나와야해
		assertThatThrownBy(() -> new Retry("3"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("입력된 숫자는 1 또는 2 이어야 합니다.");
	}

	@Test
	void retry_영어_입력_테스트() {
	    //given <= 이렇게 주어졌을때

	    //when <= 이걸 실행하면

	    //then <= 이렇게 나와야해
		assertThatThrownBy(() -> new Retry("e"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("입력된 값은 숫자가 아닙니다.");
	}

	@Test
	void retry_입력_사이즈_테스트() {
		//given <= 이렇게 주어졌을때

		//when <= 이걸 실행하면

		//then <= 이렇게 나와야해
		assertThatThrownBy(() -> new Retry("12"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("입력은 한글자만 가능합니다.");
	}
}