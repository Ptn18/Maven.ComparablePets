package io.zipcoder;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {
    public int compare(Pet o1, Pet o2) {
        // Comparing type, breaking ties with names
        Integer compareType = o1.getClass().getName().compareTo(o2.getClass().getName());
        if(compareType == 0){

            return  o1.getName().compareTo(o2.getName());
        }
        return compareType;
    }
}
