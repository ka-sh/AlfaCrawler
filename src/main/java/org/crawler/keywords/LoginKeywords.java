package org.crawler.keywords;

/**
 * LoginKeywords holds keywords that crawler is looking for during the login
 * operation
 * 
 * @author Kareem El-Shahawe
 * */
public enum LoginKeywords {
	USERNAME("userName"), PASSWORD("password"), WrongUserOrPassword(
			"either your username or password are incorrect");

	private String keyword;

	/**
	 * Private constructor to prevent initialization
	 * 
	 * @param keyword
	 *            keyword that crawler is searching for.
	 * */
	private LoginKeywords(String keyword) {
		this.keyword = keyword;
	}

	/**
	 * Return value of the keyword needed
	 * 
	 * @return value of keyword needed.
	 * */
	public String value() {
		return this.keyword;
	}
}
