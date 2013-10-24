package org.crawler.user.services;

import java.util.Map;

import org.crawler.exceptions.JsoupExecuteException;
import org.crawler.exceptions.userservicesexceptions.ConnectionProplemException;
import org.crawler.exceptions.userservicesexceptions.WrongCredentialException;
import org.crawler.services.CrawlerServices;

/**
 * LoginServices interface define functions needed for login along with all
 * other helper functions.
 * 
 * @author Kareem El-Shahawe
 * */
public interface LoginService extends CrawlerServices {
	/**
	 * Login function is used for perform login
	 * 
	 * @return connection cookies used to initiating other requests to the site.
	 * @throws ConnectionProplemException
	 *             in case of connection issue.
	 * @throws WrongCredentialException
	 *             In case of wrong username or password.
	 * @throws JsoupExecuteException
	 *             If there is an issue during executing Jsoup connection.
	 * */
	Map<String, String> login() throws ConnectionProplemException,
			WrongCredentialException, JsoupExecuteException;
}
