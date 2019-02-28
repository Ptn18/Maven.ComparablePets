package io.zipcoder;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Application {
    public static void main(String[] args) {
        IOConsole inputOutput = new IOConsole();
        Integer numberOfPet = Integer.valueOf(inputOutput.getStringInput("How many pet do you have?"));

        //create a list to store the type of pets the user put and what they said
        ArrayList<Pet> petList = new ArrayList<Pet>();

        //5 you should ask me 5 times
        for(int i = 0; i <numberOfPet ; i++) {
            String kindOfPet = inputOutput.getStringInput("What kind of pet do you have?");
            String nameOfPet = inputOutput.getStringInput("What is the name of your pets?");
            Pet pet = createPet(kindOfPet, nameOfPet);
            petList.add(pet);
        }
        //sort
        Collections.sort(petList);
        for(int i = 0; i < petList.size(); i++)
        System.out.println(petList.get(i));

    }

    protected static Pet createPet(String kindOfPet, String nameOfPet) {
        Pet pet = null;

        if(kindOfPet.equalsIgnoreCase("Pig")){
           pet = new Pig();
        } else if(kindOfPet.equalsIgnoreCase("Dog")) {
            pet = new Dog();
        }else if(kindOfPet.equalsIgnoreCase("Cat")){
            pet = new Cat();
        }
        pet.setName(nameOfPet);

        return pet;
    }


}


