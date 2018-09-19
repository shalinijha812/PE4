package myexercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharTest {
    CountChar input;

    @Before
    public void setUp() throws Exception {
        input=new CountChar();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getTheCount() {
        //Arrange
        int expectedValue=2;
        //Act
        int result=input.getTheCount("Anima",'a');
        //Assert
        assertEquals(expectedValue,result);
    }
}