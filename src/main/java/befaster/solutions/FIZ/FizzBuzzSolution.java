package befaster.solutions.FIZ;


import befaster.runner.SolutionNotImplementedException;
//- A number is "fizz" if it is divisible by 3 or if it has a 3 in it
//- A number is "buzz" if it is divisible by 5 or if it has a 5 in it
//- A number can be both "fizz" and "buzz" at the same time. If this happens then write "fizz buzz"


public class FizzBuzzSolution {

	public static final int FIZZ = 3 ;
	public static final int BUZZ = 5 ;
	
	public static final String STR_FIZZ = "fizz" ;
	public static final String STR_BUZZ = "buzz" ;
	
    public String fizzBuzz(Integer number) {
    	StringBuilder response = new StringBuilder();
    	
    	
    	if((number.intValue() % FIZZ ==0) && (number.intValue() % BUZZ ==0)  || isFizzBuzz(number) ) {
    		response.append(STR_FIZZ).append(" ").append(STR_BUZZ);
    	}else if( number.intValue() % FIZZ ==0 || isFizz(number.intValue())) {
    		response.append(STR_FIZZ) ;
    	}else if( number.intValue() % BUZZ ==0 || isBuzz(number.intValue())) {
    		response.append(STR_BUZZ) ;
    	}else {
    		response.append(number);
    	}
    		
    	return response.toString() ;
    }
    
    private boolean isBuzz(Integer number) {
    	if(Integer.toString(number).indexOf(Integer.toString(BUZZ))>-1) 
    		return true ;
    	
    	return false ;
    }
    
    private boolean isFizz(Integer number) {
    	if(Integer.toString(number).indexOf(Integer.toString(FIZZ))>-1) 
    		return true ;
    	
    	return false ;
    }
    
    private boolean isFizzBuzz(Integer number) {
    	if(isFizz(number) && isBuzz(number)) 
    		return true ;
    	
    	return false ;
    }

}
