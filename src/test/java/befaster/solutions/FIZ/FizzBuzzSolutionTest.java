package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


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

