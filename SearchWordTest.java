package myexercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchWordTest {
    SearchWord input;

    @Before
    public void setUp() throws Exception {
        input=new SearchWord();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getTheIndexOfWord() {
        //Arrange
        boolean expectedValue=true;
        //Act
        boolean result=input.getTheIndexOfWord("She sells seashells by the seashore");
    }
}