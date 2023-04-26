import java.util.ArrayList;

public class Location {
    private ArrayList<Animal> animals;

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }
    
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

}
