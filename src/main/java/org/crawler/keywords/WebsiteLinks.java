package org.crawler.keywords;

/**
 * WebsiteLinks contain links used to perform connection operations.
 * 
 * @author Kareem El-Shahawe
 * */
public enum WebsiteLinks {

	LOGIN("http://www.myaiesec.net/login.do"), LOGOUT(
			"http://www.myaiesec.net/logout.do"),REFERE("http://www.myaiesec.net/logout.do");

	private String link;

	/**
	 * Private constructor to prevent initialization
	 * 
	 * @param link
	 *            website link used in initiating
	 * */
	private WebsiteLinks(String link) {
		this.link = link;
	}

	/**
	 * Return value of the link
	 * 
	 * @return value of the link used for connection.
	 * */

	public String value() {
		return this.link;
	}
}
