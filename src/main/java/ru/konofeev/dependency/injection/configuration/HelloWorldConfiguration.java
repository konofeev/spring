package ru.konofeev.dependency.injection.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.konofeev.dependency.injection.helloworld.HelloWorldMessageProvider;
import ru.konofeev.dependency.injection.helloworld.MessageProvider;
import ru.konofeev.dependency.injection.helloworld.MessageRenderer;
import ru.konofeev.dependency.injection.helloworld.StandardOutMessageRenderer;

/**
 * Конфигурация Spring
 */
@Configuration
public class HelloWorldConfiguration
{
    /**
     * Провайдер текстовой строки
     * @return провайдер текстовой строки
     */
    @Bean
    public MessageProvider provider()
    {
        return new HelloWorldMessageProvider();
    }

    /**
     * Стандартный поток вывода сообщения
     * @return стандартный поток вывода сообщения
     */
    @Bean
    public MessageRenderer renderer()
    {
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }
}
