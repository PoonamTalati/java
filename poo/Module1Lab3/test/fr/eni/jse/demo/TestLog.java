package fr.eni.jse.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
	
	public static Logger logger=(Logger) LoggerFactory.getLogger("fr.eni.jse.demo");
	
		public static void main(String[] args) {
			myFunction();
		}

		private static void myFunction() {
			
			logger.trace("We are in the Logger myfunction.");
			logger.debug("Testing myFunction");
			logger.warn("There is some problem with this class");
			try
			{
				Class.forName("Class do not exist.");
			}
			catch(Exception e)
			{
				logger.error("Problem occured :"+e.getMessage());
			}
		}
		
}
