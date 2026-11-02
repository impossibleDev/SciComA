package u3.GameChars;

public class HealerMage extends Mage implements Healing {
    private int health;
    private int healAmount = 50;
    public HealerMage(String name, int mana) {
        super(name, 100);
    }


    @Override
    public  void attack(){
        System.out.printf("%s casts a spell of literally nothing", getName());
    }

    //ovveriding the heal method
    public int heal(GameCharacter ally) {
        //Polymorphism in action: ally.getName() works for any subclass of GameCharacter passed in
        System.out.printf("%s heals %s for %d health.\n", getName(), ally.getName(), health);
        return healAmount;
    }
}
