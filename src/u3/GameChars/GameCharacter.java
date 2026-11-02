package u3.GameChars;

public abstract class GameCharacter {

    //FIELDS
    private String name;
    //CONSTRUCTORS
    public GameCharacter(String name) {
        this.name = name;
    }

    //GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //MOVEMENT
    public void move() {
        System.out.printf("%s moves forward.\n", name);
    }

    //there is no body, so the subclasses must
    //override this method & provide implementation
    public abstract void attack();

    @Override
    public String toString() {
        return "GameCharacter [name=" + name + ", " + getClass().getSimpleName() + "]";
    }
}
