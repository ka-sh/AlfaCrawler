package org.crawler.user.services;

import java.io.IOException;
import java.util.Map;

import org.crawler.exception.userservicesexceptions.ConnectionProplemException;
import org.crawler.exception.userservicesexceptions.WrongCredentialException;
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
	 * @throws ConnectionProplemException in case of connection issue.
	 * @throws IOException Any other exception
	 * @throws WrongCredentialException  In case of wrong username or password.
	 * */
	Map<String, String> login()throws ConnectionProplemException, IOException, WrongCredentialException;
}
