package org.crawler.exceptions.userservicesexceptions;

import org.crawler.exceptions.CrawlerException;

/**
 * This exception is thrown when having problem connecting to the website
 * 
 * @author Kareem El-Shahawe
 * */
public class ConnectionProplemException extends CrawlerException {

	/**
	 * Generated serial ID
	 */
	private static final long serialVersionUID = 7767783303516816387L;

	public ConnectionProplemException() {
		super();
	}

	public ConnectionProplemException(String message) {
		super(message);
	}

	public ConnectionProplemException(String message, Throwable cause) {
		super(message, cause);

	}

	public ConnectionProplemException(Throwable cause) {
		super(cause);
	}
}
