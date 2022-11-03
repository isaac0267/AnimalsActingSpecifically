import java.util.ArrayList;

public class AnimalActingSpecifically {
    private ArrayList<Animal> listofAnimal=new ArrayList<>();
    // we make the empty constructor for the ArrayList.
    public AnimalActingSpecifically(){
    }
    // we make the second method in the main Class.
    public void test(){
        listofAnimal.add(new Cat("Cat","pax","Moo"));
        listofAnimal.add(new Dog("Dog","Max","woff"));
        listofAnimal.add(new Dog("Dog","Alax","woof"));
        System.out.println(listofAnimal);
    }


    public static void main(String[] args) {
        // we're making the object
        AnimalActingSpecifically Animal= new AnimalActingSpecifically();
        Animal.test();
        Cat cat=new Cat("Cat","pax","meoo"); // we are making the new object Cat.
        cat.scratch();
        Dog dog=new Dog("Dog","Max","Woff");
        dog.beg();




    }

}

