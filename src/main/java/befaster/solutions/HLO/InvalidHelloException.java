package befaster.solutions.HLO;

public class InvalidHelloException extends RuntimeException {

	/**
	 * serialVersion
	 */
	private static final long serialVersionUID = 2759338979431763095L;

	public InvalidHelloException() {

	}

	public InvalidHelloException(String message) {
		super(message);

	}

	public InvalidHelloException(Throwable cause) {
		super(cause);

	}

	public InvalidHelloException(String message, Throwable cause) {
		super(message, cause);

	}

	public InvalidHelloException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
