package u3;

public class U3App {
    public static void main(String[] args) {

        //testing enemy object

        //create enemy object
        Vampire vampire = new Vampire();
        Werewolf werewolf = new Werewolf();
        

        //Create an Enemy pointer
        Enemy enemy = vampire;
        Enemy[] enemies = {vampire, werewolf};

        for (Enemy v: enemies){
            v.talk();
        }

        //invoke the talk method on our object
        /*
        EXAMPLE OF ABSTRACTION, u dont care about backend code stuff, 
        u only care that it talks and it works
        */
        // enemy.talk();
        // vampire.talk();
        // vampire.attack();
    }
}
