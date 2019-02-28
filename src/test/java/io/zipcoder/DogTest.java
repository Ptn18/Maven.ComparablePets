package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testSpeak() {
        //Given
        Dog dog = new Dog();
        String expectedSpeak = "Woof!";

        //When
        String actualSpeak = dog.speak();

        //
        Assert.assertEquals(expectedSpeak,actualSpeak);
    }
}
