package befaster.solutions.FIZ;


import java.util.ArrayList;
import java.util.List;

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
		StringBuilder response = new StringBuilder();
		
		// Validate fizz buzz deluxe odd even
		if(fizzDeluxeList.contains(number) && buzzDeluxeList.contains(number) && !isOdd(number)) {
			response.append(STR_FIZZ).append(" ").append(STR_BUZZ).append(" ").append(STR_DELUXE);
		}else if(fizzDeluxeList.contains(number) && buzzDeluxeList.contains(number) && isOdd(number)) {
			response.append(STR_FIZZ).append(" ").append(STR_BUZZ).append(" ").append(STR_FAKE_DELUXE);
		}
		// Validate fizz deluxe odd even
		else if(fizzDeluxeList.contains(number) && !isOdd(number)) {
			response.append(STR_FIZZ).append(" ").append(STR_DELUXE);
		}else if(fizzDeluxeList.contains(number) && isOdd(number)) {
			response.append(STR_FIZZ).append(" ").append(STR_FAKE_DELUXE);
		}
		// Validate buzz deluxe odd even
		else if(buzzDeluxeList.contains(number) && !isOdd(number)) {
			response.append(STR_BUZZ).append(" ").append(STR_DELUXE);
		}else if(buzzDeluxeList.contains(number) && isOdd(number)) {
			response.append(STR_BUZZ).append(" ").append(STR_FAKE_DELUXE);
		}
		
		// Validate fizz buzz
		else if(fizzList.contains(number) && buzzList.contains(number)) {
			response.append(STR_FIZZ).append(" ").append(STR_BUZZ);
		}
		// Validate fizz 
		else if(fizzList.contains(number)) {
			response.append(STR_FIZZ);
		}
		// Validate fizz char 
		else if(containFizzCharNum(number)) {
			response.append(STR_FIZZ);
		}
		// Validate buzz char 
		else if(containBuzzCharNum(number)) {
			response.append(STR_BUZZ);
		}
		else {
			response.append(number);
		}
		
		return response.toString() ;
    }


	private boolean isOdd(int value) {
		boolean odd = false ; ;
		if(value % 2 !=0) {
			odd = true ;
		}
		return odd ;
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
    
    

}
