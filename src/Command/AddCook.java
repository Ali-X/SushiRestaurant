package Command;

import Worker.Cook;

public class AddCook extends AddWorker {

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		AddWorker.closet.cook = new Cook();
		System.out.println(AddWorker.closet.cook.getName() + " is coming...");
	}

}
