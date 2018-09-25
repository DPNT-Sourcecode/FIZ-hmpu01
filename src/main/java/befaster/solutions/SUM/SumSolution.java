package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

public class SumSolution {
	
	// Min value
	private static final int MIN_BOUNDS = 0 ;
	
	// Max value
	private static final int MAX_BOUNDS = 100 ;
	

    public int compute(int x, int y) {
    	int sum = 0 ;
    	if(inBounds(x) && inBounds(y)) {
    		
    	}else {
    		throw new InvalidSumException("Invalid input values x:"+x+" y:"+y);
    	}
        throw new SolutionNotImplementedException();
    }

    private boolean inBounds(int value) {
    	boolean inBounds = false ;
    	if(value >= MIN_BOUNDS && value <= MAX_BOUNDS) {
    		inBounds = true ;
    	}
    	return inBounds;
    }
    
}
