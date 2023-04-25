public class Animal {
    
    private String description;
    private boolean haslegs;
    private int legnum;
    private boolean haswings;
    private int wingnum;
    private AnimalMouthType mouthtype;
    

    public Animal(String description, boolean haslegs, int legnum, boolean haswings, int wingnum, AnimalMouthType mouthtype) {
        this.description = description;
        this.haslegs = haslegs;
        this.legnum = legnum;
        this.haswings = haswings;
        this.wingnum = wingnum;
        this.mouthtype = mouthtype;
    }
}

