package question2.question21;

import container.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AnimalTests.
 *
 * @author Roy Geagea
 * @version 1.0
 */
public class AnimalTests extends junit.framework.TestCase {
    
    /**
     * Default constructor for test class BoxTests
     */
    public AnimalTests()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    public void testAnimals() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question2/question21/README.TXT");
        Animal cat = ctx.getBean("animal1");
        Animal dog = ctx.getBean("animal2");
        assertEquals(cat.executeAnimal(), "Meow");
        assertEquals(dog.executeAnimal(), "Wuff");
    }
}
