package baseball;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;


import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PlayerNumberTest extends NsTest{

	@Test
	void 플레이어_입력_중복_테스트() {
		assertSimpleTest(() ->
			assertThatThrownBy(() -> runException("122"))
				.isInstanceOf(IllegalArgumentException.class)
		);
	}

	@Override
	public void runMain() {
		Application.main(new String[]{});
	}

}