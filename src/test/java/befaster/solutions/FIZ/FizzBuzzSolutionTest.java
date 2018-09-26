package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FizzBuzzSolutionTest {
    private FizzBuzzSolution fizzBuzz;
    

    @Before
    public void setUp() {
    	fizzBuzz = new FizzBuzzSolution();

    }
    
    
//    
//    Some requests have failed (18/45). Here are some of them:
//    	 - {"method":"fizz_buzz","params":[13],"id":"FIZ_R5_010"}, expected: "fizz", got: "13"
//    	 - {"method":"fizz_buzz","params":[43],"id":"FIZ_R5_011"}, expected: "fizz", got: "43"
//    	 - {"method":"fizz_buzz","params":[163],"id":"FIZ_R5_012"}, expected: "fizz", got: "163"
//    	[31mYou have received a penalty of: 10 min[m
//    	[34mThe round will restart now[m

   
    
    @Test
    public void printoOut(){
    	for(int i=1; i <10000;i++) {
    		System.out.println(i+" "+fizzBuzz.fizzBuzz(i));
    		//testValue(i,fizzBuzz.fizzBuzz(i));
    	}
    }
    
    private void testValue(int value, String response){
    	if(isDeluxe(value)) {
    		if((value % 3 ==0 && value % 5 == 0) || (containFizzCharNum(value) && containBuzzCharNum(value))) {
        		assertThat(response,equalTo("fizz buzz "+getDeluxeString(value)+"deluxe"));
        	}else {
        		if(value % 3 ==0) {
        			if(!containBuzzCharNum(value)) {
        				assertThat(response,equalTo("fizz "+getDeluxeString(value)+"deluxe"));
        			}else {
        				assertThat(response,equalTo("fizz buzz "+getDeluxeString(value)+"deluxe"));
        			}
        		}else if(value % 5 ==0) {
        			if(!containFizzCharNum(value)) {
        				assertThat(response,equalTo("buzz "+getDeluxeString(value)+"deluxe"));
        			}else {
        				assertThat(response,equalTo("fizz buzz "+getDeluxeString(value)+"deluxe"));
        			}
        		}else {
        			if(containFizzCharNum(value)) {
        				assertThat(response,equalTo("fizz "+getDeluxeString(value)+"deluxe"));
            		}else if(containBuzzCharNum(value)) {
            			assertThat(response,equalTo("buzz "+getDeluxeString(value)+"deluxe"));
            		}else {
            			assertThat(response,equalTo(getDeluxeString(value)+"deluxe"));
            		}
        		}
        	}
    	}else {
    		if((value % 3 ==0 && value % 5 == 0) || (containFizzCharNum(value) && containBuzzCharNum(value))) {
        		assertThat(response,equalTo("fizz buzz"));
        	}else {
        		if(value % 3 ==0) {
        			if(!containBuzzCharNum(value)) {
        				assertThat(response,equalTo("fizz"));
        			}else {
        				assertThat(response,equalTo("fizz buzz"));
        			}
        		}else if(value % 5 ==0) {
        			if(!containFizzCharNum(value)) {
        				assertThat(response,equalTo("buzz"));
        			}else {
        				assertThat(response,equalTo("fizz buzz"));
        			}
        		}else {
        			if(containFizzCharNum(value)) {
        				assertThat(response,equalTo("fizz"));
            		}else if(containBuzzCharNum(value)) {
            			assertThat(response,equalTo("buzz"));
            		}else {
            			assertThat(response,equalTo(Integer.toString(value)));
            		}
        		}
        	}
    	}
    	
 
    }
    
    private String getDeluxeString(int value) {
		String message = "" ;
		if(value % 2 !=0) {
			message = "fake " ;
		}
		return message ;
	}
    
    @Test
    public void testRegexNumbersSame() {
    	 Pattern pattern = Pattern.compile("\\b(\\d)\\1+\\b");
    	 
    	 Matcher matcher = pattern.matcher("44444");
    	 
    	 assertThat(matcher.find(),equalTo(true));
    }
    
    
    @Test
    public void testRegexNumbersDifferent() {
    	 Pattern pattern = Pattern.compile("\\b(\\d)\\1+\\b");
    	 
    	 Matcher matcher = pattern.matcher("444244");
    	 
    	 assertThat(matcher.find(),equalTo(false));
    }
    
    private boolean isDeluxe(int value) {
    	Pattern pattern = Pattern.compile("\\b(\\d)\\1+\\b");
    	boolean deluxe = false ;
    	Matcher matcher = pattern.matcher(Integer.toString(value));
    	
    	if(value >= 10 && matcher.find()) {
    		deluxe = true ;
    	}
    			
    	return deluxe ;
    }
    
    private boolean containBuzzCharNum(Integer number) {
    	if(Integer.toString(number).indexOf(Integer.toString(FizzBuzzSolution.BUZZ))>-1) 
    		return true ;
    	
    	return false ;
    }
    
    private boolean containFizzCharNum(Integer number) {
    	if(Integer.toString(number).indexOf(Integer.toString(FizzBuzzSolution.FIZZ))>-1) 
    		return true ;
    	
    	return false ;
    }
}

