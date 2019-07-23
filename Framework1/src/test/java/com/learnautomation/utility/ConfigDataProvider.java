package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		File file = new File("./Configuration/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to load config file " + e.getMessage());
		}
	}

	public String getDatafromConfig(String keytosearch) {
		return pro.getProperty(keytosearch);
	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}

	public String getStagingURL() {
		return pro.getProperty("qaurl");
	}
}
