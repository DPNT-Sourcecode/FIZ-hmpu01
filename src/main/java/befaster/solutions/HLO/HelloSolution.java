package befaster.solutions.HLO;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Stream;



import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
	
	private static final Logger LOGGER = LogManager.getLogManager().getLogger(HelloSolution.class.getName());
	
	public final static String MESSAGE_FILE = "helloMsg.txt" ;
	
	public String hello(String friendName) {
		return loadMessage() ;
	}

	private String loadMessage() throws InvalidHelloException {
		String message = null ;
		try {
			Path path = Paths.get(getClass().getClassLoader().getResource(MESSAGE_FILE).toURI());

			StringBuilder data = new StringBuilder();
			Stream<String> lines = Files.lines(path);
			lines.forEach(line -> data.append(line));
			lines.close();
			
			message = data.toString();
		} catch (URISyntaxException e) {
			LOGGER.log(Level.SEVERE,"Error locating file "+MESSAGE_FILE,e);
			throw new InvalidHelloException("Error locating file "+MESSAGE_FILE,e);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE,"loadMessage error",e);
			throw new InvalidHelloException("loadMessage error",e);
		}
		
		return message ;
	}
}
