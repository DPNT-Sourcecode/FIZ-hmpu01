package befaster.solutions.HLO;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HelloSolutionTest {
    private HelloSolution hello;

    @Before
    public void setUp() {
    	hello = new HelloSolution();
    }

    @Test
    public void helloWorld() {
        assertThat(hello.hello("Ossie"),equalTo("Hello, Ossie!"));
    }
    
    @Test(expected = InvalidHelloException.class)
    public void helloWorld_invalid() {
    	hello.hello(null);
    }
}

