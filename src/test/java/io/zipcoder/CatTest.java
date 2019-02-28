package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void testSpeak() {
        //Given
        Cat cat = new Cat();
        String expectedSpeak = "Meow!";
        //When
        String actualSpeak = cat.speak();
        //

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }
}
