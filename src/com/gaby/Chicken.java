/*In the class ObservableValue listing below, 
 * the internal state of the model is captured by the integer n. 
 * This value is accessed (and, more importantly, modified) only 
 * through public accessors. If the value is changed, 
 * the observable object invokes its own setChanged() 
 * method to indicate that the state of the model has changed. 
 * It then invokes its own notifyObservers() method 
 * in order to update all of the registered observers.
 */
 package com.gaby;
 

import java.util.Observable;

class Chicken extends Observable {
	String name;
	boolean laidEgg = false;
	int numberOfEggs;

	Chicken(String name) {
		this.name = name;
	}

	public void layEgg() {
		this.laidEgg = true;
		this.setChanged();
		this.notifyObservers();
		this.laidEgg = false;
	}

	public String toString() {
		return this.name;
	}

	public boolean laidEgg() {
		return laidEgg;
	}
	

}
