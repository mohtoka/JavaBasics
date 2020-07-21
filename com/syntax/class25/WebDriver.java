package com.syntax.class25;

public class WebDriver {
	public void open() {
		System.out.println("Opening browser");
	}
}

class Firefox extends WebDriver {
	public void open() {
		System.out.println("Opening Firefox browser");
	}
}

class Chrome extends WebDriver {
	public void open() {
		System.out.println("Opening Chrome browser");
	}
}

class InternetExplorer extends WebDriver {
	public void open() {
		System.out.println("Opening Internet Explorer browser");
	}
}