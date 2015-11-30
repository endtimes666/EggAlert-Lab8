package com.gaby;

import java.util.Observable;
import java.util.Observer;

class EggAlert implements Observer {
	public void update(Observable chicken, Object arg) {
		if (((Chicken) chicken).laidEgg()) {
			System.out.println(chicken + " has laid an egg");
		}
	}
}
