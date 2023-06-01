package baseball;

import java.util.ArrayList;
import java.util.List;


import camp.nextstep.edu.missionutils.Randoms;

public class Computer {

	static final int MIN_VALUE = 1;
	static final int MAX_VALUE = 9;

	public List<Integer> addComputerNumber(){
		List<Integer> computerNumber = new ArrayList<>();
		while(computerNumber.size() < 3){
			int randomNumber = Randoms.pickNumberInRange(MIN_VALUE,MAX_VALUE);
			if(!computerNumber.contains(randomNumber)){
				computerNumber.add(randomNumber);
			}
		}
		return computerNumber;
	}

}
