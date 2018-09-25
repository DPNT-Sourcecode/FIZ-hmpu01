package befaster.solutions.SUM;

public class InvalidSumException extends RuntimeException {

	/**
	 * serialVersion
	 */
	private static final long serialVersionUID = 2759338979431763095L;

	public InvalidSumException() {

	}

	public InvalidSumException(String message) {
		super(message);

	}

	public InvalidSumException(Throwable cause) {
		super(cause);

	}

	public InvalidSumException(String message, Throwable cause) {
		super(message, cause);

	}

	public InvalidSumException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
