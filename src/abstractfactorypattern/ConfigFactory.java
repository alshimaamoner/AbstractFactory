/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;

/**
 *
 * @author PC HOME
 */
public class ConfigFactory {
       public GUIFactory readApplicationConfig(String type) throws Exception{
        GUIFactory factory;
        if (type.equals( "Windows")) 
            factory = new WinFactory();
        else if (type.equals("Mac")) 
            factory = new MacFactory();
        else
            throw new Exception("Error! Unknown operating system.");
        return factory;
    }
}
