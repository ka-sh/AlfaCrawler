package org.crawler.user.servicesImplemtation;

import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Map;

import org.crawler.exceptions.JsoupExecuteException;
import org.crawler.exceptions.userservicesexceptions.ConnectionProplemException;
import org.crawler.exceptions.userservicesexceptions.WrongCredentialException;
import org.crawler.keywords.LoginKeywords;
import org.crawler.keywords.WebsiteLinks;
import org.crawler.user.services.LoginService;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.user.entity.UserLoginAccount;

public class LoginServiceImpl implements LoginService {

	/** Reply of the login post request */
	private Response response;

	/**
	 * Implementation of login service
	 * 
	 * {@inheritDoc}
	 * 
	 * */
	public Map<String, String> login() throws ConnectionProplemException,
			WrongCredentialException, JsoupExecuteException {
		Connection connection = initLoginConnection();
		try {
			response = connection.execute();
			// Checking response
			checkResponse();

		} catch (ConnectException |UnknownHostException ex) {
			// UnknownHostException thrown when there is no connection
			throw new ConnectionProplemException(ex.getMessage()
					+ " Check your Internet Connection.", ex.getCause());

		} catch (IOException e) {
			throw new JsoupExecuteException(e.getMessage(), e.getCause());

		}

		return response.cookies();
	}

	/**
	 * InitLoginConnection initialize the connection object with the required
	 * connection configurations.
	 * 
	 * @return Connection connection object used to get login response.
	 * */
	private final Connection initLoginConnection() {
		Connection connection = Jsoup.connect(WebsiteLinks.LOGIN.value());
		connection.data(LoginKeywords.USERNAME.value(),
				UserLoginAccount.getUsername(), LoginKeywords.PASSWORD.value(),
				UserLoginAccount.getPassword());
		// Setting up Max size to get full page
		connection.maxBodySize(0);
		// Setting up the user browser configuration
		connection.userAgent(UserLoginAccount.getUserAgent());
		connection.referrer(WebsiteLinks.REFERE.value());
		connection.method(Method.POST);

		return connection;
	}

	/**
	 * checkResponse check login response for any errors and if found it throws
	 * corresponding exception
	 * 
	 * @throws WrongCredentialException
	 *             in case of wrong username or password
	 * */
	private void checkResponse() throws WrongCredentialException {
		if (response.body().toLowerCase()
				.contains(LoginKeywords.WrongUserOrPassword.value())) {
			throw new WrongCredentialException("Wrong username or password.");
		}
	}
}
