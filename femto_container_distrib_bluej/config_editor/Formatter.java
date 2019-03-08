package config_editor;


/** Interface pour la g�n�ration du fichier de configuration selon plusieurs formats.
 * 
 */
public interface Formatter{
    
  public void newLine();
  public void newText(String text);
  
  public void newComment(String comment);
  public void newCommentLine();
  
  
  
  public void newBeanId(int beanNumber, String beanName);
  
  public void newBeanClass(String beanName, String beanClassName);
  
  public void newBeanPropertyKey(int number, String completeBeanName, String propertyName);
  
  public void newBeanPropertyValue(int number, String completeBeanName, String propertyName, String propertyValue);
  
  public String get();
}
