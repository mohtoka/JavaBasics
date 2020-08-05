package com.syntax.class26;

public abstract class File {
	// open, edit, close

	public abstract void open();

	public void edit() {
		System.out.println("can edit");
	}

	public void close() {
		System.out.println("can close");
	}
}

class JavaFile extends File {
	public void open() {
		System.out.println("can open in eclipse");
	}
}

class WordFile extends File {
	public void open() {
		System.out.println("can open in microsoft word");
	}
}

class PDFFile extends File {
	public void open() {
		System.out.println("can open in preview");
	}
}