package org.crawler.user.servicesImplemtation;

import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Map;

import org.crawler.exceptions.JsoupExecuteException;
import org.crawler.exceptions.userservicesexceptions.ConnectionProplemException;
import org.crawler.keywords.WebsiteLinks;
import org.crawler.user.services.LogoutService;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.user.entity.UserLoginAccount;

/**
 * Implementation of logout service
 * 
 * @author Kareem EL-Shahawe
 * 
 * */
public class LogoutServiceImpl implements LogoutService {

	/** Response used to connect to the used */
	Response response;

	/**
	 * logout implementation if logout service {@inheritDoc}
	 * */
	public void logout(Map<String, String> cookies)
			throws ConnectionProplemException, JsoupExecuteException {
		initLogout(cookies);

	}

	/**
	 * initLogout send logout request to website
	 * 
	 * @param cookies
	 *            user account cookies used for connection
	 * @throws ConnectionProplemException
	 *             If there is a problem with connection
	 * @throws JsoupExecuteException
	 *             If there is an issue during executing connection request.
	 * 
	 * */
	private void initLogout(Map<String, String> cookies)
			throws ConnectionProplemException, JsoupExecuteException {
		try {
			response = Jsoup.connect(WebsiteLinks.LOGOUT.value())
					.cookies(cookies)
					.userAgent(UserLoginAccount.getUserAgent())
					.method(Method.GET).execute();
		} catch (ConnectException | UnknownHostException ex) {
			// UnknownHostException thrown when there is no connection
			throw new ConnectionProplemException(ex.getMessage()
					+ " Check your Internet Connection.", ex.getCause());

		} catch (IOException e) {
			// If there is a problem during execution
			throw new JsoupExecuteException(e.getMessage(),e.getCause());
		}
	}

}
