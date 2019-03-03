package question2.question21;


/**
 * Write a description of class Cat here.
 *
 * @author Roy Geagea
 * @version 1.0
 */
public class Cat implements Sound {
    
    @Override
    public String makeSound() {
        String sound = "Meow";
        System.out.println("Cat make sound " + sound);
        return sound;
    }
    
}
