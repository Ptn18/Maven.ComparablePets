package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void testGetSetName(){
        //given
        Cat cat = new Cat();
        String name = "Mee";

        //when
        cat.setName(name);

        //Then
        String actualName = cat.getName();
        Assert.assertEquals(name, actualName);
    }
    @Test
    public void testComparable(){
        //Given
        Pet pet1 = new Pig();
        Pet pet2= new Pig();
        pet1.setName("Pizza");
        pet2.setName("Apple");

        //When
        Integer actualResult = pet1.compareTo(pet2);

        //Then
        Assert.assertTrue(actualResult>0);

    }
    @Test
    public void testComparable1(){
        //Given
        Pet pet1 = new Pig();
        Pet pet2= new Pig();
        pet2.setName("Pizza");
        pet1.setName("Apple");

        //When
        Integer actualResult = pet1.compareTo(pet2);

        //Then
        Assert.assertTrue(actualResult < 0);

    }
    @Test
    public void testComparable2(){
        //Given
        Pet pet1 = new Pig();
        Pet pet2= new Pig();
        pet1.setName("Pizza");
        pet2.setName("Pizza");
        Integer expectedResult = 0;

        //When
        Integer actualResult = pet1.compareTo(pet2);

        //Then
        Assert.assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testComparable3(){
        //Given
        Pet pet1 = new Pig();
        Pet pet2= new Dog();
        pet1.setName("Pizza");
        pet2.setName("Pizza");

        //When
        Integer actualResult = pet1.compareTo(pet2);

        //Then
        Assert.assertTrue(actualResult>0);

    }

}
