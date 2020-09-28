/* File: KarelDemocracy.java
 * -------------------------
 * In KarelDemocracy.java, Karel navigates a voting ballot, and 
 * ensures all unnecessary chads are removed.
 */
import stanford.karel.*;



public class KarelDemocracy extends SuperKarel {
	public void run() {
		move();
		while (beepersPresent()) {
			move();
			move();
		while (noBeepersPresent()) {
			searchBallot(); 
		}	
		}
	}	
		
		
		private void searchBallot() {  //Karel searches ballot for chads
			checkForChads();
			move();
			move(); 
		}
		
		private void checkForChads() {  //Karel checks for and removes extra unwanted chads
			moveTop();
			clearChads();
			descend();
			moveBottom();
			clearChads();
			ascend();
		}
		
		private void clearChads() {   //Karel picks up unwanted chads
			while (beepersPresent()) {
				pickBeeper();
			}
			
		}
		
		private void moveTop() {
			turnLeft();
			move();
		}
		
		private void descend() {
			turnAround();
			move();
			turnLeft(); 
		}
		
		private void moveBottom() {
			turnRight();
			move();
		}
		
		private void ascend() {
			turnAround();
			move();
			turnRight();
		}
}
