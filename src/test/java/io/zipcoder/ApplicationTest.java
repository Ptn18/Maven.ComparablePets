package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void testCreatePet_whenIsPig(){
        //Given
        String petType = "pig";
        String petName = "Burin";

        //When
        Pet pet = Application.createPet(petType, petName);

        //Then
        String actualName = pet.getName();

        Assert.assertEquals(petName, actualName);
        Assert.assertTrue(pet instanceof Pig);

    }
    @Test
    public void TestCreatePet_whenIsDog(){
        //Given
        String petType = "dog";
        String petName = "Mocha";

        //When
        Pet pet = Application.createPet(petType,petName);

        //Then
        String actualName = pet.getName();

        Assert.assertEquals(petName, actualName);
        Assert.assertTrue(pet instanceof Dog);
    }
    @Test
    public void TestCreatPet_whenIsCat(){
        //Given
        String petType = "cat";
        String petName = "Bailey";

        //When
        Pet pet = Application.createPet(petType,petName);

        //Then
        String actualName = pet.getName();

        Assert.assertEquals(petName,actualName);
        Assert.assertTrue(pet instanceof Cat);
    }

}