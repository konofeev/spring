/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myspring.myspring;

/**
 * Стандратный поток оторажения
 */
public class StandardOutMessageRenderer implements MessageRenderer
{
    private MessageProvider provider;

    @Override
    public void render() 
    {
        if (provider == null)
        {
            throw new RuntimeException("You must set the property messageProvider of class: " + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(provider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) 
    {
        this.provider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() 
    {
        return provider;
    }
}
