package befaster.solutions.HLO;

import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.stream.Stream;



import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
	
	private static final Logger LOGGER = LogManager.getLogger(HelloSolution.class.getName());
	
	public final static String MESSAGE_FILE = "helloMsg.txt" ;
	
	public String hello(String friendName) {
		throw new SolutionNotImplementedException();
	}

	private String loadMessage() throws InvalidHelloException {
		String message = null ;
		try {
			Path path = Paths.get(getClass().getClassLoader().getResource(MESSAGE_FILE).toURI());

			StringBuilder data = new StringBuilder();
			Stream<String> lines = Files.lines(path);
			lines.forEach(line -> data.append(line).append("\n"));
			lines.close();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return message ;
	}
}
