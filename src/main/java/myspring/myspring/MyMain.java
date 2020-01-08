package myspring.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author gabrielle
 */
public class MyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/app-context.xml");
        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
    
}
