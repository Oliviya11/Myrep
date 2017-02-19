import stanford.karel.*;
//—в≥ти мають назви: CarelandNespaper,CarelandNespaper2,CarelandNespaper3
public class HW2First extends SuperKarel{

	public void run(){
		while (frontIsClear()){move();}
		turnRight();
		while (leftIsBlocked()) {move();}
		turnLeft(); move(); pickBeeper();
		turnLeft();turnLeft(); move(); turnRight();
		while (frontIsClear()){move();}
		turnLeft();
		while (frontIsClear()){move();}
		turnLeft();turnLeft();
	}
}
