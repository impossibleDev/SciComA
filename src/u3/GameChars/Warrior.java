package u3.GameChars;
//This class extends (aka inherits from) GameCharacter
public class Warrior extends GameCharacter {

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    private String weaponType;
    // constructor
    public Warrior(String name, String weaponType) {
        super(name);
        this.weaponType = weaponType;
    }

    // overriding the attack method
    @Override
    public void attack() {
        System.out.printf("%s swings their might %s.\n", getName(), getWeaponType());
    }

    //First way (if it's inherited from the superclass)
//    @Override
//    public String toString() {
//        return String.format("%s (%s)", getName(), getClass().getSimpleName());
//    }

    //Second way (Override with custom warrior-specific details)
    @Override
    public String toString() {
        return String.format("%s is wielding a %s", getName(), weaponType);
    }

}
