package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Retry {

	public boolean retryOrExit() {
		String answer = Console.readLine();
		return retry(answer);
	}

	public boolean retry(String answer) throws IllegalArgumentException{
		if(Integer.parseInt(answer) != 1 && Integer.parseInt(answer) != 2){
			throw new IllegalArgumentException("1 또는 2를 입력해주세요.");
		}
		if(Integer.parseInt(answer) == 1){
			return true;
		}
		return false;
	}
}
