package com.capgemini.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {
	
	public static void main(String[] args) throws FileNotFoundException {
		File input= new File("D:\\CAPGEMINIJA17\\CapgeminiLabBook\\src\\com\\capgemini\\lab8\\source.txt");
		File output=new File("D:\\CAPGEMINIJA17\\CapgeminiLabBook\\src\\com\\capgemini\\lab8\\target.txt");
		
		FileInputStream fIn=new FileInputStream(input);
		FileOutputStream fOut=new FileOutputStream(output);
		
		CopyDataThread cdt=new CopyDataThread(fIn,fOut);
		cdt.run();
	}

}
