package u3.GameChars;

public class Mage extends GameCharacter{
    private int mana;

    public Mage(String name, int mana) {
        super(name);
        this.mana = mana;
    }

    @Override
    public void attack() {
        if (mana>10){
            System.out.printf("%s casts %s\n", getName(), mana);
            mana -= 10;
        } else{
            System.out.printf("%s is out of mana!\n", getName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s have %s mana", getName(), mana);
    }
}
