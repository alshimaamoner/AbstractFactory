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
public class AbstractFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ConfigFactory configFactory=new  ConfigFactory();
        configFactory.readApplicationConfig("Windows").createButton().paint();
        
    }
 
}
