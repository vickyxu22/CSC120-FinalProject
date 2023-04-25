import java.util.ArrayList;

public class Location {
    private ArrayList<Animal> animals;

    private Location(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal() {
        this.animals.add(Animal());
    }

}
