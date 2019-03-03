package question2.exemples;


import container.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BoxTests.
 *
 * @author Roy Geagea
 * @version 1.0
 */
public class BoxTests extends junit.framework.TestCase {
    
    /**
     * Default constructor for test class BoxTests
     */
    public BoxTests()
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
    
    public void testBox1() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question2/exemples/README.TXT");
        Box<Integer> box =  ctx.getBean("box");
        box.set(1);
        assertEquals((int)box.get(),1);
        assertEquals(Box.class,ctx.getType("box"));
    }
    
        public void testBox2() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question2/exemples/README.TXT");
        Box<String> box =  ctx.getBean("box2");
        box.set("Roy");
        assertEquals((String)box.get(),"Roy");
        assertEquals(Box.class,ctx.getType("box2"));
    }
}
