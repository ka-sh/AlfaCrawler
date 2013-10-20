package org.crawler.user.servicesImplemtation;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Map;

import org.crawler.exception.userservicesexceptions.ConnectionProplemException;
import org.crawler.exception.userservicesexceptions.WrongCredentialException;
import org.crawler.keywords.LoginKeywords;
import org.crawler.user.services.LoginService;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.user.entity.UserLoginAccount;

public class LoginServiceImpl implements LoginService {

	/** Reply of the login post request */
	private Response response;

	/** Holding account information used for connection */
	private UserLoginAccount accountInfo;

	/**
	 * LoginService constructor
	 * 
	 * @param accountINfo
	 *            account information required for logging to the site.
	 * */
	public LoginServiceImpl(final UserLoginAccount accountINfo) {
		this.accountInfo = accountINfo;
	}

	/**
	 * Implementation of login service
	 * 
	 * {@inheritDoc}
	 * 
	 * */
	public Map<String, String> login() throws ConnectionProplemException,
			IOException, WrongCredentialException {
		Connection connection = initLoginConnection();
		try {
			response = connection.execute();
			//Checking response
			checkResponse();
			
		} catch (IOException e) {
			if (e instanceof UnknownHostException) {
				throw new ConnectionProplemException(e.getMessage()
						+ " Check your Internet Connection.", e.getCause());
			}
			throw e;

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
		Connection connection = Jsoup.connect(accountInfo.getLoginUrl());
		connection.data(LoginKeywords.USERNAME.keyword(),
				accountInfo.getUsername(), LoginKeywords.PASSWORD.keyword(),
				accountInfo.getPassword());
		// Setting up Max size to get full page
		connection.maxBodySize(0);
		// Setting up the user browser configuration
		connection.userAgent(accountInfo.getUserAgent());
		connection.method(Method.POST);

		return connection;
	}
	
	/**
	 * checkResponse check login response for any errors and if found it throws corresponding exception
	 * @throws WrongCredentialException  in case of wrong username or password
	 * */
	private void checkResponse() throws WrongCredentialException{
		if(response.body().toLowerCase().contains(LoginKeywords.WrongUserOrPassword.keyword())){
			throw new WrongCredentialException("Wrong username or password.");
		}
	}
}
