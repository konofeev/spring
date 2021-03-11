package ru.konofeev.dependency.injection.helloworld;

/**
 * Отображение сообщений
 */
public interface MessageRenderer
{
    /**
     * Отобразить сообщение
     */
    void render();

    /**
     * Установить провайдер сообщений
     * @param provider провайдер сообщений
     */
    void setMessageProvider(MessageProvider provider);

    /**
     * Получить провайдер сообщений
     * @return провайдер сообщений
     */
    MessageProvider getMessageProvider();
}
