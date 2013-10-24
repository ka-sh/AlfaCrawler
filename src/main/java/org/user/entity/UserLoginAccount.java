package org.user.entity;

/**
 * 
 * 
 * UserLoginAccount holds the data used for logging in.
 * 
 * @author Kareem El-Shahawe
 * */
public class UserLoginAccount {
	/** User username */
	private static String USERNAME;
	/** User password */
	private static String PASSWORD;
	/** User browser Agent */
	private static String USERAGENT;

	/**
	 * Retrieve username used to login to the target site
	 * 
	 * @return username account
	 * */
	public static final String getUsername() {
		return USERNAME;
	}

	/**
	 * Set username used to login to the target site.
	 * 
	 * @param username
	 *            used for login
	 */
	public static void setUsername(final String username) {
		USERNAME = username;
	}

	/**
	 * Retrieve password used to login to the target site.
	 * 
	 * @return password used to login to the target site
	 * */
	public static final String getPassword() {
		return PASSWORD;
	}

	/**
	 * Set password used to login to the target site
	 * 
	 * @param password
	 *            password used to login to the target site.
	 * */
	public static void setPassword(final String password) {
		PASSWORD = password;
	}

	/**
	 * Retrieve user browser agent configuration
	 * 
	 * @return user browser agent configuration.
	 * */
	public static final String getUserAgent() {
		return USERAGENT;
	}

	/**
	 * SEt user browser agent configuration
	 * 
	 * @param userAgent
	 *            user browser agent configuration
	 * */
	public static void setUserAgent(final String userAgent) {
		USERAGENT = userAgent;
	}

}
