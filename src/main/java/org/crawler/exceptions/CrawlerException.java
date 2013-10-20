package org.crawler.exceptions;

/**
 * Crawler super exception extended by all other exceptions
 * 
 * @author Kareem El-Shahawe
 * */
public class CrawlerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5626926799320360148L;

	public CrawlerException() {
		super();

	}

	public CrawlerException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CrawlerException(String message, Throwable cause) {
		super(message, cause);
	}

	public CrawlerException(String message) {
		super(message);
	}

	public CrawlerException(Throwable cause) {
		super(cause);
	}

}
