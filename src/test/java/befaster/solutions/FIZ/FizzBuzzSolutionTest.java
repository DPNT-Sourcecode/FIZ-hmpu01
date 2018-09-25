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
    public void compute_fizzLoop() {
        for(int i=1 ; i<10000; i++) {
        	System.out.println(i + " "+fizzBuzz.fizzBuzz(i));
        }
    }

//    @Test
//    public void compute_fizzbuzz() {
//        assertThat(fizzBuzz.fizzBuzz(15), equalTo("fizz buzz"));
//    }
    
    @Test
    public void compute_fizz() {
        assertThat(fizzBuzz.fizzBuzz(3), equalTo("fizz"));
    }
    
    @Test
    public void compute_buzz() {
        assertThat(fizzBuzz.fizzBuzz(5), equalTo("buzz"));
    }
    
    
    @Test
    public void compute() {
        assertThat(fizzBuzz.fizzBuzz(-2), equalTo("-2"));
    }
    
//    
//    @Test(expected = InvalidSumException.class)
//    public void compute_sum_invalid() {
//    	sum.compute(-10, 200);
//    }
}

