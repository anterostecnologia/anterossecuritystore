package br.com.anteros.security.store.exception;

public class AnterosSecurityStoreException extends RuntimeException {

	public AnterosSecurityStoreException() {
	}

	public AnterosSecurityStoreException(String message) {
		super(message);
	}

	public AnterosSecurityStoreException(Throwable cause) {
		super(cause);
	}

	public AnterosSecurityStoreException(String message, Throwable cause) {
		super(message, cause);
	}

	public AnterosSecurityStoreException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
