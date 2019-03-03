package service_locator;


/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import container.*;


public class test {

    public static void main (String[] args) { 
        ApplicationContext ctx = Factory.createApplicationContext("./service_locator/README.TXT");
 
        ServiceLocatorI serviceLocator = ctx.getBean("serviceLocator");


        System.out.println("------------------------------------------------");
        for(String service : serviceLocator){
            System.out.println("\t" + service);
        }
    }
}
