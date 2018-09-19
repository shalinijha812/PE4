package myexercise4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {
    SortWords input;

    @Before
    public void setUp() throws Exception {
        input=new SortWords();
    }

    @After
    public void tearDown() throws Exception {
        input=null;
    }

    @Test
    public void getTheSortedWords() {
        //Arrange
        String[] expectedValue={"earth","is","it","planet","the","this","to","welcome"};
        //Act
        String[] result=input.getTheSortedWords("Welcome to the planet earth.This is it.");
        //Assert
        assertEquals(expectedValue,result);
    }
}