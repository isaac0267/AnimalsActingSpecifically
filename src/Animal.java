public class  Animal  {
    // The attribute for the name and for the cat and for the dog.
    private String animalType;
    private String name;
    private String sound;

    // making the constructor for the Animal.

    public Animal(String animalType, String name, String sound){
        this.animalType=animalType;
        this.name=name;
        this.sound=sound;
    }

    // empty constructor
    public Animal(){

    }
    // getter for the Animal.
    public String getAnimalType(){
        return animalType;
    }
    public String getName(){
        return name;
    }
    public String getSound(){
        return sound;
    }

    // making the setter for the Animal.
    public void setAnimalType(String animalType){
        this.animalType=animalType;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSound(String sound){
        this.sound=sound;
    }
    // making the method that call animalSound.
    public String animalSound(){
        return "Animal sound";
    }


    // To String.


    @Override
    public String toString() {
        return " Animal type:"+animalType+", "+"name:"+name+", "+"sound: "+sound;
    }
}
