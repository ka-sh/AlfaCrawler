package org.crawler.exceptions;

import java.io.IOException;

/**
 * JsoupExecuteException is thrown when there is no Obvious exception. Wrapper
 * for {@link IOException} thrown by Jsoup
 * 
 * @author Kareem
 * */
public class JsoupExecuteException extends CrawlerException {

	/**
	 * Generated serial ID
	 */
	private static final long serialVersionUID = 701471113932614701L;

	public JsoupExecuteException() {
		super();

	}

	public JsoupExecuteException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public JsoupExecuteException(String message, Throwable cause) {
		super(message, cause);

	}

	public JsoupExecuteException(String message) {
		super(message);

	}

	public JsoupExecuteException(Throwable cause) {
		super(cause);

	}

}
