package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Elaborazione el=new Elaborazione();
        el.createEl();
        Server server= new Server(1234);
    }
}