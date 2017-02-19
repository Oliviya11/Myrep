import javax.swing.text.rtf.RTFEditorKit;

import stanford.karel.*;
//—в≥ти мають назви Lab,Lab2,Lab3,Lab4
public class HW2Second extends SuperKarel{
public void run(){
	while (frontIsClear()){
		 if (leftIsBlocked()){
		 while(leftIsBlocked()){
		if (frontIsClear()){
			 move();
			 }
		 }
		 turnLeft();
		while (frontIsClear()){ move();}
		turnLeft();
		while (rightIsBlocked()){
			if (frontIsClear()){
			move();}
			if (frontIsBlocked()&&facingWest())break;
		}
		turnRight();
		while (frontIsClear()){ move();}
		turnRight();
		 }
		 else {
		 turnLeft();
		 while (frontIsClear()){ move();}
		 turnRight();
		  }
		 }	
	
 }
}

	
	
	
	
	

