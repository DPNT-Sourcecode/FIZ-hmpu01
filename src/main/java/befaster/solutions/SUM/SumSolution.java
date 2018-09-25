package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {
	
	// Min value
	private static final int MIN_BOUNDS = 0 ;
	
	// Max value
	private static final int MAX_BOUNDS = 100 ;
	
	private static final String NL = System.getProperty("line.separator");
	
	

    public int compute(int x, int y) {
    	int sum = 0 ;
    	if(inBounds(x) && inBounds(y)) {
    		sum = x + y ;
    	}else {
    		StringBuilder errorMsg = new StringBuilder();
    		errorMsg.append("Invalid input values x:").append(x);
    		errorMsg.append(NL);
    		errorMsg.append("y:").append(y);
    		throw new InvalidSumException(errorMsg.toString());
    	}
    	return sum ;
    }

    private boolean inBounds(int value) {
    	boolean inBounds = false ;
    	if(value >= MIN_BOUNDS && value <= MAX_BOUNDS) {
    		inBounds = true ;
    	}
    	return inBounds;
    }
    
}
