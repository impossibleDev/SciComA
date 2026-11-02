package u3.GameChars;

public class Archer extends GameCharacter{

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        //random range is from 0 to 4.999;
        double randomNum = Math.random() * 5;
        System.out.printf("%s shoots an arrow, it %s the target!\n", getName(), randomNum>3 ? "hits" : "misses");
    }

    @Override
    public String toString() {
        return String.format("%s holds his bow, sharp and focuses", getName());
    }
}
