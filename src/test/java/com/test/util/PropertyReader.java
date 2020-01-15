package com.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader
{
	public static void loadProperties() throws FileNotFoundException, IOException
	{
		try (InputStream input = new FileInputStream("src//test//resources//config.properties"))
		{
			final Properties prop = new Properties();
			prop.load(input);
			for (final String k : prop.stringPropertyNames())
				System.setProperty(k, prop.getProperty(k));
		}
	}
}
