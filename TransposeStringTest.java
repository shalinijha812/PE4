package myexercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString input;

    @Before
    public void setUp() throws Exception {
        input=new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getTheTranspose() {
        //Arrange
        String expectedValue="si a";
        //Act
        String result=input.getTheTranspose("is a");
        //Assert
        assertEquals(expectedValue,result);
    }
}