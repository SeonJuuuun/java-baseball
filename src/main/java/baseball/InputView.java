package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

	public void startMessage() {
		System.out.println("숫자 야구 게임을 시작합니다.");
	}

	public void inputMessage() {
		System.out.print("숫자를 입력해주세요 : ");
	}

	public List<Integer> inputPlayerNumber() {
		List<Integer> playerNumber = new ArrayList<>();
		String number = Console.readLine();
		playerNumException(number);
		for (int i = 0; i < number.length(); i++) {
			overLapCheck(playerNumber,number,i);
			playerNumber.add(number.charAt(i) - '0');
		}

		return playerNumber;
	}

	public void playerNumException(String input) throws IllegalArgumentException{
		inputRangeCheck(input);
		sizeCheck(input);
		numberCheck(input);
	}

	public void inputRangeCheck(String input) throws IllegalArgumentException{
		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) - '0' == 0){
				throw new IllegalArgumentException("1에서 9 사이의 숫자를 입력해야 합니다.");
			}
		}
	}

	public void overLapCheck(List<Integer> player, String input, int i) throws IllegalArgumentException{
		if(player.contains(input.charAt(i) - '0')){
			throw new IllegalArgumentException("중복된 수는 입력할 수 없습니다.");
		}
	}

	public void sizeCheck(String player) throws IllegalArgumentException{
		if (player.length() != 3) {
			throw new IllegalArgumentException("입력한 수는 세자리여야 합니다.");
		}
	}

	public void numberCheck(String player) throws IllegalArgumentException{
		if (!Pattern.matches("^[0-9]*$", player)) {
			throw new IllegalArgumentException("숫자만 입력해야 합니다.");
		}
	}
}
