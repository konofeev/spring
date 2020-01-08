package myspring.myspring;

/**
 *
 * @author gabrielle
 */
public class HelloWorldMessageProvider implements MessageProvider
{
    @Override
    public String getMessage() 
    {
        return "Hello World!";
    }
    
}
