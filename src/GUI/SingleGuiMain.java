/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import GUI.GuiMain;

/**
 *
 * @author ErIcK
 */
public class SingleGuiMain {
        private static GuiMain uniqueInstance=null;
    	public static synchronized GuiMain getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new GuiMain();

		return uniqueInstance;
	}
        
    public SingleGuiMain(){
        getInstance();
    }
}
