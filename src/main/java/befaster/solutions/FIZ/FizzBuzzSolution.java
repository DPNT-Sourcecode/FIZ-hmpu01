package befaster.solutions.FIZ;


import java.util.ArrayList;
import java.util.List;

import befaster.runner.SolutionNotImplementedException;
//- A number is "fizz" if it is divisible by 3 or if it has a 3 in it
//- A number is "buzz" if it is divisible by 5 or if it has a 5 in it
//- A number can be both "fizz" and "buzz" at the same time. If this happens then write "fizz buzz"


public class FizzBuzzSolution {

	public static final int FIZZ = 3 ;
	public static final int BUZZ = 5 ;
	
	private List<Integer> fizzList  ;
	private List<Integer> buzzList  ;
	private List<Integer> fizzBuzzList  ;
	
	
	public static final String STR_FIZZ = "fizz" ;
	public static final String STR_BUZZ = "buzz" ;
	
	public FizzBuzzSolution() {
		fizzList = getDivideByNumList(FIZZ);
		buzzList = getDivideByNumList(BUZZ);
		fizzBuzzList = getDivideBy3And5List();
		
		fizzList.removeAll(fizzBuzzList);
		buzzList.removeAll(fizzBuzzList);
		
	}
	
	
	public String fizzBuzz(Integer number) {
    	StringBuilder response = new StringBuilder();
    	
    	
    	if((fizzBuzzList.contains(number)) || (containFizzCharNum(number) && containBuzzCharNum(number)) ){
    		response.append(STR_FIZZ).append(" ").append(STR_BUZZ);
    	}else {
    		if(fizzList.contains(number) ) {
    			if(!containBuzzCharNum(number)) {
    				response.append(STR_FIZZ);
    			}else {
    				response.append(STR_FIZZ).append(" ").append(STR_BUZZ);
    			}
    		}else if( buzzList.contains(number)) {
    			if(!containFizzCharNum(number)) {
    				response.append(STR_BUZZ);
    			}else {
    				response.append(STR_FIZZ).append(" ").append(STR_BUZZ);
    			}
        	}else {
        		if(containFizzCharNum(number)) {
        			response.append(STR_FIZZ);
        		}else if(containBuzzCharNum(number)) {
        			response.append(STR_BUZZ);
        		}else {
        			response.append(number);
        		}
        		
        	}
    	}
    		
    	return response.toString() ;
    }

    
    private boolean containBuzzCharNum(Integer number) {
    	if(Integer.toString(number).indexOf(Integer.toString(BUZZ))>-1) 
    		return true ;
    	
    	return false ;
    }
    
    private boolean containFizzCharNum(Integer number) {
    	if(Integer.toString(number).indexOf(Integer.toString(FIZZ))>-1) 
    		return true ;
    	
    	return false ;
    }
  
    
    private List<Integer> getDivideByNumList(int number){
    	List<Integer> divideByList = new ArrayList<Integer>() ;
    	for(int i=1; i <10000;i++) {
    		if(i%number==0)
    			divideByList.add(i);
    	}
    	return divideByList ;
    }
    
    private List<Integer> getDivideBy3And5List(){
    	List<Integer> divideByList = new ArrayList<Integer>() ;
    	for(int i=1; i <10000;i++) {
    		if(i % FizzBuzzSolution.FIZZ ==0 && i % FizzBuzzSolution.BUZZ ==0 )
    			divideByList.add(i);
    	}
    	return divideByList ;
    }
    
    

}
