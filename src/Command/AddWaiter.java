package Command;

import Worker.Waiter;

public class AddWaiter extends AddWorker {

	@Override
	public void excecute() {
		// TODO Auto-generated method stub
		AddWorker.closet.waiter = new Waiter();
		System.out.println(AddWorker.closet.waiter.getName() + " is coming...");
	}
}
