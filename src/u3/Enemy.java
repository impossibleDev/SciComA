package u3;

/* 
Enemy: parent class, vampire and werewolfs are subclasses, 
this is POLYMORPHISM 
*/

//This is a template class for an enemy object
public class Enemy {
    //attributes of the enemt
    private int health;

    public Enemy(int health){
        super();
        this.health = health;
    }

    /*  NOTES: if u dont have a constructor method, then 
        java will automatically create a default constructor method */
    public Enemy(){
        super();
        this.health = 100;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int health){
        this.health=health;
    }

    public void talk(){
        System.out.println("I'm an enemy, you better run!");
    }

    public void attack(){
        System.out.println("enemy swings his sword");
    }
}
