package question1.exemples;


/**
 * Write a description of class Box here.
 *
 * @author Roy Geagea
 * @version 1.0
 */
public class Box<T> {
   private T t;

   public void set(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }
}
