package io.zipcoder;

public class Pet implements Comparable<Pet> {
    private String name;

    public String speak() {
    return "speak";
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public int compareTo(Pet o) {
        //telling the program how to sort it(by names and then type if names are equal)
        Integer compareName = this.name.compareTo(o.name);
        if(compareName == 0){
            //if compareName == 0, that means the names are the same and we need to compare the type which is the class name
            //for example, Pig, Cat,etc.. getName is for getting the name of the class.
          return  this.getClass().getName().compareTo(o.getClass().getName());
        }
        return compareName;
    }
}