package org.crawler.keywords;
/**
 * LoginKeywords holds keywords that crawler is looking for during the login operation
 * 
 * @author Kareem El-Shahawe
 * */
public enum LoginKeywords {
	USERNAME("userName"), PASSWORD("password"),WrongUserOrPassword("either your username or password are incorrect");

	private String keyword;

	private LoginKeywords(String keyword) {
		this.keyword = keyword;
	}

	public String keyword() {
		return this.keyword;
	}
}
