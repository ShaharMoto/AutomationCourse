package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import java.lang.RuntimeException;

public class PropertyUtils {
	Properties properties = new Properties();
	
	public PropertyUtils(String path) 
	{
		try {
			properties.load(new FileInputStream(path));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String getProperty(final String key) 
	{
		String property = properties.getProperty(key);
		return property;
	}
}
