package Restaurant;

import Worker.AssistantCook;
import Worker.Worker;

public class Closet {
	
	private static Closet firstInst = null;
	
	public static Closet getInstance() {

		if (firstInst == null) {
			firstInst = new Closet();
		}
		return firstInst;
	}
	
	public Worker accountant;
	public Worker cleaningwoman;
	public Worker dishwasher;
	public Worker waiter;
	public Worker cook;
	public AssistantCook assistantcook;
	
	
}
