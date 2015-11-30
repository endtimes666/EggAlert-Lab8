/*An Observable object can have one or more Observers. 
 * You’ll have to set which objects are observing your Observable. 
 * This Observable class, when it needs to tell its observers 
 * it has updated, can set a flag that means it has updated, 
 * and then call one method – notifyObservers - to notify all of its observers.
 */


/*Can you add comments to this code to explain what is going on? 
 * How does information flow through the program?
Can you add another class called EggCounter? 
EggCounter should also be an Observer. 
It will also observe your Chicken objects, 
and keep track of how many eggs each chicken has laid. 

---> IF NUMBEROFEGGS PER CHICKEN IS NOT STORED IN CHICKEN, THEN WHERE?
Your EggCounter should do ALL of the counting – 
don’t add a counter to your chicken class! 
Your Chickens don’t know and don’t care 
how many eggs they have laid.
Add some more Chickens to TestObserver 
and lay some more eggs to test your code.
 */
package com.gaby;

import java.util.Observable;
import java.util.Observer;

public class TestObserver implements Observer {

	public static void main(String[] args) {
		
		//new egg alert object
		EggAlert eggMonitor = new EggAlert();
		
		//new chicken
		Chicken a = new Chicken("Mavis");
		//points observer eggMonitor to chicken a
		a.addObserver(eggMonitor);
		
		Chicken b = new Chicken("Betty");
		//points observer eggMonitor to chicken b
		b.addObserver(eggMonitor);
		
		Chicken c = new Chicken("Betty");
		//points observer eggMonitor to chicken b
		c.addObserver(eggMonitor);
		
		Chicken d = new Chicken("Betty");
		//points observer eggMonitor to chicken b
		d.addObserver(eggMonitor);
		
		//lay some eggs
		a.layEgg();
		b.layEgg();
		c.layEgg();
		d.layEgg();
		d.layEgg();
	}

	//
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
}






