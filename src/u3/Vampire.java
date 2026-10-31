package u3;

public class Vampire extends Enemy {

    /* We want to create a subclass Vampire from the superclass 
        Enemy and we want to inherit all of the properties that
        the superclass Enemy already has so that we don't have
        to rewrite the same code over and over again 
     */

    //I will override the talk() method
    @Override //u dont have to have this, but its good habit to keep, mae the compiler work better
    public void talk() {
        System.out.println("raugh I'm a vampire i drink blood for breakfast");
    }

    @Override
    public void attack() {
        System.out.println("vampire lunges forward");
    }
}
