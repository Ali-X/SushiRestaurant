package Command;

import Worker.AssistantCook;


public class AddAssistantCook{

	public void add() {
		AddWorker.closet.assistantcook = new AssistantCook();
		System.out.println(AddWorker.closet.assistantcook.getName() + " is coming...");
	}

}
