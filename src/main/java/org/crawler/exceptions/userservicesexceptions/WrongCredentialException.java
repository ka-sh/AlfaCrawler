package org.crawler.exceptions.userservicesexceptions;

import org.crawler.exceptions.CrawlerException;

/**
 * Exception thrown when user provide wrong username or password
 * 
 * @author Kareem El-Shahawe
 * */
public class WrongCredentialException extends CrawlerException {

	/**
	 * Generated serial ID
	 */
	private static final long serialVersionUID = -4786391014307842947L;

	public WrongCredentialException() {
		super();
	}

	public WrongCredentialException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WrongCredentialException(String message, Throwable cause) {
		super(message, cause);
	}

	public WrongCredentialException(String message) {
		super(message);
	}

	public WrongCredentialException(Throwable cause) {
		super(cause);

	}

}
