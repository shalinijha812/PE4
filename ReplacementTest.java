package myexercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplacementTest {
    Replacement input;

    @Before
    public void setUp() throws Exception {
        input=new Replacement();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getTheReplacement() {
        //Arrange
        String expectedValue="walcoma";
        //Act
        String result=input.getTheReplacement("welcome",'e','a');
    }
}