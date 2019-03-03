package service_locator;

import container.*;


public class ServiceLocatorTests extends junit.framework.TestCase{

    public void testServiceLocator() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./service_locator/README.TXT");
 
        ServiceLocatorI serviceLocator = ctx.getBean("serviceLocator");

        System.out.println("Liste des services accessibles: ");
        for(String service : ctx){
            System.out.println("\t" + service);
        }
        System.out.println("------------------------------------------------");
        for(String service : serviceLocator){
            System.out.println("\t" + service);
        }
        
        syntaxe_exemples.Table table = serviceLocator.lookup("uneTable");
        table.setInt(33);table.setInt(33);
        assertEquals(3,table.taille());
        
        question1.exemples.Box<Integer> box = serviceLocator.lookup("box");
        box.set(1);
        assertEquals((int)box.get(),1);
        
        question1.exemples.Box<String> box2 = serviceLocator.lookup("box2");
        box2.set("Roy");
        assertEquals((String)box2.get(), "Roy");
        
        question2.question21.Animal cat = serviceLocator.lookup("animal1");
        question2.question21.Animal dog = serviceLocator.lookup("animal2");
        assertEquals(cat.executeAnimal(), "Meow");
        assertEquals(dog.executeAnimal(), "Wuff");
        
    }
}
