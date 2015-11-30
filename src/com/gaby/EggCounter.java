/*EggCounter should also be an Observer. 
It will also observe your Chicken objects, 
and keep track of how many eggs each chicken has laid.
Your EggCounter should do ALL of the counting – */

package com.gaby;

import java.util.Observable;
import java.util.Observer;


public class EggCounter implements Observer {
	

	@Override
	public void update(Observable chicken, Object arg) {
				if (((Chicken) chicken).laidEgg()) {
					
				}

		// TODO Auto-generated method stub
		
	}

}
