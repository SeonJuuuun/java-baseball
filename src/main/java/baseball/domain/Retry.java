package baseball.domain;

public class Retry {

	private final boolean retryNumber;

	public Retry(String retryNumber){
		checkException(retryNumber);
		this.retryNumber = conversionRetryNumber(retryNumber);
	}

	public void checkException(String retryNumber) {
		checkRetryNumberSize(retryNumber);
		validateInputRetryNumbers(retryNumber);
		checkInputNumber(retryNumber);
	}

	public void validateInputRetryNumbers(String retryNumber) throws IllegalArgumentException {
		if (retryNumber.matches("^[a-zA-Z]$")) {
			throw new IllegalArgumentException("입력된 값은 숫자가 아닙니다.");
		}
	}

	public void checkRetryNumberSize(String retryNumber) throws IllegalArgumentException {
		if(retryNumber.length() != 1){
			throw new IllegalArgumentException("입력은 한글자만 가능합니다.");
		}
	}
}
