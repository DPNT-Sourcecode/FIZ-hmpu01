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
    
    @Test
    public void printoOut(){
    	for(int i=1; i <10000;i++) {
    		System.out.println(i+" "+fizzBuzz.fizzBuzz(i));
    		testValue(i,fizzBuzz.fizzBuzz(i));
    	}
    }
    
    private void testValue(int value, String response){
    	if(isDeluxe(value)) {
    		if((value % 3 ==0 && value % 5 == 0) || (containFizzCharNum(value) && containBuzzCharNum(value))) {
        		assertThat(response,equalTo("fizz buzz deluxe"));
        	}else {
        		if(value % 3 ==0) {
        			if(!containBuzzCharNum(value)) {
        				assertThat(response,equalTo("fizz deluxe"));
        			}else {
        				assertThat(response,equalTo("fizz buzz deluxe"));
        			}
        		}else if(value % 5 ==0) {
        			if(!containFizzCharNum(value)) {
        				assertThat(response,equalTo("buzz deluxe"));
        			}else {
        				assertThat(response,equalTo("fizz buzz deluxe"));
        			}
        		}else {
        			if(containFizzCharNum(value)) {
        				assertThat(response,equalTo("fizz deluxe"));
            		}else if(containBuzzCharNum(value)) {
            			assertThat(response,equalTo("buzz deluxe"));
            		}else {
            			assertThat(response,equalTo("deluxe"));
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
    
    private boolean isDeluxe(Integer number) {
    	boolean deluxe = (number>=10) ?  true : false ;
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

