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
    public void compute_fizzbuzz() {
        assertThat(fizzBuzz.fizzBuzz(3), equalTo("fizz"));
    }
//    
//    @Test(expected = InvalidSumException.class)
//    public void compute_sum_invalid() {
//    	sum.compute(-10, 200);
//    }
}

