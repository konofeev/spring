/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myspring.myspring;

/**
 * Отображение сообщений
 */
interface MessageRenderer 
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
