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
public class Application {
    private GUIFactory factory;
    private Button button;
    
    public Application(GUIFactory factory) {
        this.factory=factory;
    }
    public void createButton(){
        this.button=factory.createButton();
    }
    public void paint(){
        button.paint();
    }
    
}
