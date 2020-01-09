package myspring.myspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
        return  renderer;
    }
}
