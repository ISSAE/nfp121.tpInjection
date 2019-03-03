package question2.question21;


/**
 * Write a description of class Animal here.
 *
 * @author Roy Geagea
 * @version 1.0
 */
public class Animal {
   private Sound animal;
   
   public Animal(Sound animal){
      this.animal = animal;
   }
   
   public Animal(){}
   
   public void setAnimal(Sound animal){
      this.animal = animal;
   }

   public String executeAnimal() {
      return animal.makeSound();
   }
}
