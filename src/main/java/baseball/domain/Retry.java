package baseball.domain;

public class Retry {

	private final boolean retryNumber;

	public Retry(String retryNumber){
		this.retryNumber = conversionRetryNumber(retryNumber);
	}
}
