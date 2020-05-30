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
public interface GUIFactory {
    public Button createButton();
    public CheckBox createCheckBox();
}
