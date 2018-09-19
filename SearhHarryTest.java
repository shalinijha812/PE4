package myexercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.naming.directory.SearchControls;

import static org.junit.Assert.*;

public class SearhHarryTest {
    SearhHarry input;

    @Before
    public void setUp() throws Exception {
        input=new SearhHarry();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void harrySearcher() {
        //Arrange
        boolean expectedValue=false;
        //Act
        boolean result=input.harrySearcher("This is HARRY");
        //Assert
        assertEquals(expectedValue,result);
    }
}