package ru.konofeev.dependency.injection;

import lombok.experimental.UtilityClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.konofeev.dependency.injection.configuration.HelloWorldConfiguration;
import ru.konofeev.dependency.injection.helloworld.MessageRenderer;
import ru.konofeev.dependency.injection.knight.Knight;

/**
 * Точка входа
 * Примеры внедрения зависимостей и разных конфигураций
 */
@UtilityClass
public class MainDependencyInjection
{
    public void main(String[] arguments)
    {
        // Пример использования конфигурации с xml-описанием
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring/application-context-di.xml");

        // Пример использования конфигурации с аннотированным классом
        // ApplicationContext context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // Пример с "Hello World"
        MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
        renderer.render();

        // Пример с рыцарем
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
