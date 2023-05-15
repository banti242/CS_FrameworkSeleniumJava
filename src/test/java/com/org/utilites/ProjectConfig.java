package com.org.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProjectConfig {
	
	static String filePath="E:\\Eclpse-WorkSpace\\SeleniumFrameWork\\Configuration\\config.properties";
	
	static File file=new File(filePath);
	static FileInputStream fis=null;
	public static Properties  props=new Properties();

	static {
		try {
			fis=new FileInputStream(file);
			props.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getBaseUrl() {
		String value=props.getProperty("baseUrl");
		if(value!=null)
		return value;
		else
			throw new RuntimeException("url  not specified in config file");
		
	}
	public String getBrowser() {
		String value=props.getProperty("browser");
		if(value!=null)
		return value;
		else
			throw new RuntimeException("url  not specified in config file");
		
	}
}
