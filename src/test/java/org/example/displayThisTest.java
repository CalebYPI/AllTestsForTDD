package org.example;

import com.sun.org.apache.xml.internal.serializer.utils.Utils;
import org.junit.*;

public class displayThisTest {

    @Before
    public void setUp() throws Exception {
        displayThis display = new displayThis();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Ignore
    @Test
    public void setRandomValue() {
        Assert.assertEquals(5,5);
    }

    @Test
    public void getRandomValue() {
        Assert.assertSame(5,5);
    }

    @Test
    public void fail(String message) {
        message = "Test failed";
    }

    @Test(timeout = 1000)
    public void testWithTimeout() {
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("processing " + factorialOf + "!");
    }
}