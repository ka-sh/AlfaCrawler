package org.user.entity;

/**
 * 
 * 
 * UserLoginAccount holds the data used for logging in.
 * 
 * @author Kareem El-Shahawe
 * */
public class UserLoginAccount {
	private String username;
	private String password;
	private String loginUrl;
	private String userAgent;

	/**
	 * Retrieve username used to login to the target site
	 * 
	 * @return username account
	 * */
	public final String getUsername() {
		return username;
	}

	/**
	 * Set username used to login to the target site.
	 * 
	 * @param username
	 *            used for login
	 */
	public void setUsername(final String username) {
		this.username = username;
	}

	/**
	 * Retrieve password used to login to the target site.
	 * 
	 * @return password used to login to the target site
	 * */
	public final String getPassword() {
		return password;
	}

	/**
	 * Set password used to login to the target site
	 * 
	 * @param password
	 *            password used to login to the target site.
	 * */
	public void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * Retrieve the URL of the target website
	 * 
	 * @return target website URL
	 * */
	public final String getLoginUrl() {
		return loginUrl;
	}

	/**
	 * Set target website URL
	 * 
	 * @param loginUrl
	 *            URL of the target website.
	 * */
	public void setLoginUrl(final String loginUrl) {
		this.loginUrl = loginUrl;
	}

	/**
	 * Retrieve user browser agent configuration
	 * 
	 * @return user browser agent configuration.
	 * */
	public final String getUserAgent() {
		return userAgent;
	}

	/**
	 * SEt user browser agent configuration
	 * 
	 * @param userAgent
	 *            user browser agent configuration
	 * */
	public void setUserAgent(final String userAgent) {
		this.userAgent = userAgent;
	}

}
