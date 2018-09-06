package com.teamsankya.calculater;

import java.io.IOException;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.SimpleLayout;

public class Addition {
	private static final Logger LOGGER = Logger.getLogger(Addition.class);

	static {
		ConsoleAppender consoleAppender = new ConsoleAppender();
		LOGGER.addAppender(consoleAppender);
		//Layout layout = new SimpleLayout();
		/*try {
			RollingFileAppender rollingAppender = new RollingFileAppender(layout, "C:\\Tools\newfile.txt");
			LOGGER.addAppender(rollingAppender);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	public static int add(int a, int b) {
		LOGGER.info("adding 2 int " + a + " " + b);
		return a + b;
	}

	public static long add(long a, long b) {
		LOGGER.warn("adding 2 int " + a + " " + b);
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

}
