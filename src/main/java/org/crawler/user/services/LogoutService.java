package org.crawler.user.services;

import java.util.Map;

import org.crawler.exceptions.JsoupExecuteException;
import org.crawler.exceptions.userservicesexceptions.ConnectionProplemException;

/**
 * This interface provide layout for logout services used by the user
 * 
 * @author Kareem EL-Shahawe
 * */
public interface LogoutService {
	/**
	 * logout service logout the user from his current account. used to
	 * terminate the current connection.
	 * 
	 * @param cookies
	 *            cookies used in connecting to the user account.
	 * @throws ConnectionProplemException
	 *             If there is a connection issue
	 * @throws JsoupExecuteException
	 *             If there is an issue during executing Jsoup connection
	 * */
	void logout(Map<String, String> cookies) throws ConnectionProplemException,
			JsoupExecuteException;
}
