package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
public static void main(String[] args) {
	String path = "text.properties";
	FileReader reader = null;
	try {
		reader = new FileReader(path);
		Properties pro = new Properties();
		pro.load(reader);
		String name = pro.getProperty("name");
		String company = pro.getProperty("company");
		String gf = pro.getProperty("gf");
		
		System.out.println(name + " " +company+" "+gf);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
