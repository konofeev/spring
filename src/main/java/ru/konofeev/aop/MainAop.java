package ru.konofeev.aop;

import lombok.experimental.UtilityClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.konofeev.dependency.injection.knight.Knight;

@UtilityClass
public class MainAop
{
    public void main(String[] arguments)
    {
        // Пример использования конфигурации с xml-описанием
        ApplicationContext context =  new ClassPathXmlApplicationContext("spring/application-context-aop.xml");

        // Пример использования конфигурации с аннотированным классом
        // ApplicationContext context =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // Пример с рыцарем
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();

    }
}
