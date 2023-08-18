package baseball.domain;

public class Retry {

	private final boolean retryNumber;

	public Retry(String retryNumber){
		this.retryNumber = conversionRetryNumber(retryNumber);
	}

	public void checkException(String retryNumber) {
		checkRetryNumberSize(retryNumber);
		validateInputRetryNumbers(retryNumber);
		checkInputNumber(retryNumber);
	}
}
