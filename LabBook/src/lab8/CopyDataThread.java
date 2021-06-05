package com.capgemini.lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDataThread extends Thread {

	FileInputStream fIn;
	FileOutputStream fOut;

	public CopyDataThread(FileInputStream fIn, FileOutputStream fOut) {
		super();
		this.fIn = fIn;
		this.fOut = fOut;
	}

	public void run() {
		int readChar = 0;
		int charCount = 0;
		try {
			while (!((readChar = fIn.read()) < 0)) {
				char c = (char) readChar;
				fOut.write(c);
				charCount += 1;
				if (charCount == 10) {
					System.out.println("10 characters are copied");
					charCount = 0;
					Thread.sleep(5000);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
