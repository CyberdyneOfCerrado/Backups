package GUI;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

class Tscroll implements AdjustmentListener{ //rolagem automatica
	private boolean flag=false;
	public Tscroll(boolean novo){
		this.flag=novo;
	}
    public void adjustmentValueChanged(AdjustmentEvent e) {
  	  if(flag)
  	  {  
  		  e.getAdjustable().setValue(e.getAdjustable().getMaximum());
  	  }
  	  flag = false;
  } 
}