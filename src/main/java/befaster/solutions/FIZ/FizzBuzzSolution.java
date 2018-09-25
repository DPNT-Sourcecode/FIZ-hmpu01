package befaster.solutions.FIZ;


import befaster.runner.SolutionNotImplementedException;
//- If the number is a multiple of three then you should write "fizz"
//- If the number is a multiple of five then you should write "buzz"
//- If the number is a multiple of both three and five then you should write "fizz buzz"


public class FizzBuzzSolution {

	public static final int FIZZ = 3 ;
	public static final int BUZZ = 5 ;
	
	public static final String STR_FIZZ = "fizz" ;
	public static final String STR_BUZZ = "buzz" ;
	
    public String fizzBuzz(Integer number) {
    	StringBuilder response = new StringBuilder();
    	
    	if((number.intValue() % FIZZ ==0) && (number.intValue() % BUZZ ==0)  ) {
    		response.append(STR_FIZZ).append(" ").append(STR_BUZZ);
    	}else if( number.intValue() % FIZZ ==0) {
    		response.append(STR_FIZZ) ;
    	}else if( number.intValue() % BUZZ ==0) {
    		response.append(STR_BUZZ) ;
    	}else {
    		response.append(number);
    	}
    		
    	return response.toString() ;
    }

}
