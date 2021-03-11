package ru.konofeev.dependency.injection.helloworld;

/**
 * Провайдер сообщений
 */
public interface MessageProvider
{
    /**
     * Получить сообщение
     * @return сообщение
     */
    String getMessage();
}
