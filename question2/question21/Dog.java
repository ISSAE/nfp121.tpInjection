package question2.question21;


/**
 * Write a description of class Dog here.
 *
 * @author Roy Geagea
 * @version 1.0
 */
public class Dog implements Sound {
    
    @Override
    public String makeSound() {
        String sound = "Wuff";
        System.out.println("Dog make sound " + sound);
        return sound;
    }
}
