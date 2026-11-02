package u3.GameChars;

public class GameAppTest {
    static GameCharacter[] teamArray = {
            new Warrior("Aragorn", "Anduril"),
            new Mage("Eowyn", 100),
            new Archer("Legolas"),
            new HealerMage("Galadriel", 100),
    };

    public static void main(String[] args) {
     System.out.println("===BATTLE BEGINS===");
     for (GameCharacter character : teamArray) {
        System.out.println(character);
        character.move();
        character.attack();
        System.out.println();
    }
     GameCharacter healerChar = teamArray[3];
     GameCharacter woundedAlly = teamArray[0];

     //VERIFY if objects implements the Healer Interface, using "instanceof"
        if (healerChar instanceof Healing){
            Healing healer = (Healing) healerChar; //need to cast to Healer so we can call heal()???
            healer.heal(woundedAlly);
        }
    }
}
