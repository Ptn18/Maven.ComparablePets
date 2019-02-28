package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PigTest {
    @Test
    public void testSpeak(){
        //Given
        Pig pig = new Pig();
        String expectedSpeak = "Oink!";
        //When
        String actualSpeak = pig.speak();

        //Then
        Assert.assertEquals(expectedSpeak,actualSpeak);

    }
}
