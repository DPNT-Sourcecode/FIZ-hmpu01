package befaster.solutions.FIZ;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//- The old rules for "deluxe" do not apply.
//- A number is "fizz deluxe" if it is divisible by 3 AND it has a 3 in it
//- A number is "buzz deluxe" if it is divisible by 5 AND it has a 5 in it
//- We should still say "fake deluxe" if the "deluxe" number is odd
//- A number can be "fizz", "buzz" and "deluxe" at the same time. If this happens then write "fizz buzz deluxe"
//- All the previous rules for "fizz" and "buzz" are still valid


public class FizzBuzzSolution {

	public static final int FIZZ = 3 ;
	public static final int BUZZ = 5 ;
	public static final String STR_FIZZ = "fizz" ;
	public static final String STR_BUZZ = "buzz" ;
	public static final String STR_DELUXE = "deluxe" ;
	public static final String STR_FAKE_DELUXE = "fake deluxe" ;
	
	private List<Integer> fizzList  ;
	private List<Integer> buzzList  ;
	private List<Integer> fizzDeluxeList  ;
	private List<Integer> buzzDeluxeList  ;
	
	
	
	public FizzBuzzSolution() {
		fizzList = getDivideByNumList(FIZZ);
		buzzList = getDivideByNumList(BUZZ);
		
		fizzDeluxeList = new ArrayList<Integer>();
		buzzDeluxeList = new ArrayList<Integer>();
		
		getDivideByNumList(FIZZ).forEach(value ->{
			if(containFizzCharNum(value)) {
				fizzDeluxeList.add(value);
			}
		});
		
		getDivideByNumList(BUZZ).forEach(value ->{
			if(containBuzzCharNum(value)) {
				buzzDeluxeList.add(value);
			}
		});
		
	}
	
	
	public String fizzBuzz(Integer number) {
		return computeFizzBuzz(number, true);
    }
	
	public String computeFizzBuzz(Integer number, boolean deluxe) {
		StringBuilder response = new StringBuilder();
    	boolean standardNumber = false ;
    	
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
        		}else if(!isDeluxe(number)) {
        			standardNumber = true ;
        			response.append(number);
        		}
        		
        	}
    	}
    	
    	if(!standardNumber && isDeluxe(number) ) {
    		if(response.length()==0) {
    			response.append(getDeluxeString(number));
    		}else {
    			response.append(" ").append(getDeluxeString(number));
    		}
    	}
    		
    		
    	return response.toString() ;
	}

	private String getDeluxeString(int value) {
		String message = null ;
		if(value % 2 ==0) {
			message = STR_DELUXE ;
		}else {
			message = STR_FAKE_DELUXE ;
		}
		
		return message ;
	}
	
    private boolean isDeluxe(int value) {
    	boolean deluxe = false ;
    	Matcher matcher = this.deluxePattern.matcher(Integer.toString(value));
    	
    	if(value >= DELUXE && matcher.find()) {
    		deluxe = true ;
    	}
    			
    	return deluxe ;
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
