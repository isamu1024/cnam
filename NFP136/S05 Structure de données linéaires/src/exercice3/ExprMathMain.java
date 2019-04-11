package exercice3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExprMathMain {

	public static void main(String[] args) {

		final Logger logger = LogManager.getLogger(ExprMath.class.getName());
		boolean check;
		String currentArg = args[0];

		if (args.length != 1) {
			logger.error("Ce programme requiert un argument.");
			System.exit(0);
		}

		logger.debug("Expression testée : " + currentArg);

		check = ExprMath.verifExpMath(currentArg);

		logger.debug(check);

		if (check)
			System.out.println("l'argument est correctement écrit");
		if (!check)
			System.out.println("l'argument n'est pas correctement écrit");

	}

}
