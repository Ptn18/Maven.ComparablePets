package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetComparatorTest {
    PetComparator comparator = new PetComparator();

    @Test
    public void testComparable(){
        //Given
        Pet pet1 = new Pig();
        Pet pet2= new Pig();
        pet1.setName("Pizza");
        pet2.setName("Apple");

        //When
        Integer actualResult = comparator.compare(pet1,pet2);

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
        Integer actualResult = comparator.compare(pet1,pet2);

        //Then
        Assert.assertTrue(actualResult<0);

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
        Integer actualResult = comparator.compare(pet1,pet2);

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
        Integer actualResult = comparator.compare(pet1,pet2);

        //Then
        Assert.assertTrue(actualResult>0);

    }
    @Test
    public void testComparable4(){
        //Given
        Pet pet1 = new Cat();
        Pet pet2= new Dog();
        pet1.setName("Pizza");
        pet2.setName("Pizza");

        //When
        Integer actualResult = comparator.compare(pet1,pet2);

        //Then
        Assert.assertTrue(actualResult < 0);

    }
    @Test
    public void testComparable5(){
        //Given
        Pet pet1 = new Pig();
        Pet pet2= new Cat();
        pet1.setName("Pizza");
        pet2.setName("Pizza");


        //When
        Integer actualResult = comparator.compare(pet1,pet2);

        //Then
        Assert.assertTrue(actualResult>0);

    }

}


