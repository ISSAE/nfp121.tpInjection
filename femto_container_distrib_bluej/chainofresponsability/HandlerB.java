package femto_container_distrib_bluej.chainofresponsability;


/**
 * D�crivez votre classe HandlerB ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class HandlerB extends Handler {

    public boolean handleRequest(int number) {
        if(number >= 2) {
            System.out.println("HandlerB : " + number + " >= 2");
            return true;
        }
        return super.handleRequest(number);
    }
}