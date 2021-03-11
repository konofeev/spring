package ru.konofeev.dependency.injection.helloworld;

/**
 * Провайдер тестового собщения "Hello World!"
 */
public class HelloWorldMessageProvider implements MessageProvider
{
    @Override
    public String getMessage() 
    {
        return "Hello World!";
    }
}
