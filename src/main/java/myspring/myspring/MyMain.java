package myspring.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Точка входа
 */
public class MyMain
{
    /**
     * Точка входа
     * @param arguments параметры командной строки
     */
    public static void main(String[] arguments)
    {
        // Использование конфигурации с использование xml-описания
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring/app-context.xml");

        // Использование конфигурации с использование аннотированного класса
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}
