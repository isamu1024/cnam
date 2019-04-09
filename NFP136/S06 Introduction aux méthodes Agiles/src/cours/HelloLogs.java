package cours;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


// Lien pour installation log4j 2 https://syncor.blogspot.com/2013/09/getting-started-with-log4j-2-in-eclipse.html

public class HelloLogs {

	private static final Logger logger = LogManager.getLogger(HelloLogs.class.getName());
	
	public static void main(String args[]) {
		
		if (args.length != 1) {
			logger.error("Ce programme requiert un argument.");
			System.exit(0);
		}
		
		if (logger.isDebugEnabled()) {
			int x = 0 ;
			for (String currentArg : args ) {
				logger.debug("args[" + x + "] = \"" + currentArg +"\"" );
				x++ ;
			}
			
		}
		
		logger.info("Bonjour "+ args[0] ) ;
	}


}
